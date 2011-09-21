/**
 * 
 */
package de.hub.clickwatch.transformationLauncher;

import java.io.IOException;
import java.util.Dictionary;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;

import de.hub.clickwatch.ui.PluginActivator;

/**
 * This class offers helper method to handle bundles on the fly
 * 
 * @author Lars George
 * 
 */
public class BundleHelper {
	/**
	 * Tries to install a bundle in the workspace with the given name. If the
	 * bundle is already installed, the reference to this one is returned.
	 * 
	 * @param bundleIdentifier
	 *            the name of the bundle that should be installed
	 * @return the installed bundle or null if the installation process failed
	 */
	public static Bundle installBundleFromWorkspace(String bundleIdentifier) {
		Bundle retBundle = null;

		try {
			// add a slash to the beginning of the identifier if needed
			if (!(bundleIdentifier.startsWith("/") || bundleIdentifier
					.startsWith("\\"))) {
				bundleIdentifier = "/" + bundleIdentifier;
			}

			// try to install the bundle
			String bundleLocation = "reference:"
					+ ResourcesPlugin.getWorkspace().getRoot().getLocationURI()
							.toURL().toString();

			retBundle = PluginActivator.getInstance().getBundle()
					.getBundleContext()
					.getBundle(bundleLocation + bundleIdentifier);

			// if its already installed, refresh it (maybe the code changed)
			if (retBundle != null) {
				retBundle.update();
			} else
				retBundle = PluginActivator.getInstance().getBundle()
						.getBundleContext()
						.installBundle(bundleLocation + bundleIdentifier);

			Dictionary<String, String> dict = retBundle.getHeaders();

			String classPath = dict.get(Constants.BUNDLE_CLASSPATH);
			boolean hasBinFolder = false;
			if (classPath != null) {
				String[] classPathArray = classPath.split(",");

				for (String cp : classPathArray) {
					if (cp.trim().equals("bin"))
						hasBinFolder = true;
				}
			} else {
				// no classpath entry in the manifest
				addBinToManifestClassPath(URI.createURI("platform:/resource"
						+ bundleIdentifier + "/META-INF/MANIFEST.MF"));

				Status s = new Status(IStatus.INFO, "not_used",
						"A ClassPath entry has been added to your Manifest.mf",
						null);
				StatusManager.getManager().handle(s, StatusManager.SHOW);
				hasBinFolder = true;

				retBundle.update();
			}
			// no bin folder in the manifest of this project?
			if (!hasBinFolder) {
				addBinToManifestClassPath(URI.createURI("platform:/resource"
						+ bundleIdentifier + "/META-INF/MANIFEST.MF"));

				Status s = new Status(
						IStatus.INFO,
						"not_used",
						"The the bin folder has been added to your ClassPath entry of the Manifest.mf",
						null);
				StatusManager.getManager().handle(s, StatusManager.SHOW);

				retBundle.update();
			}

			// try to install required bundles, so the dependencies are in the
			// osgi container
			String resources = dict.get("Require-Bundle");
			String[] resourcesArray = resources.split(",");

			for (String res : resourcesArray) {
				String[] parts = res.split(";");

				try {
					PluginActivator.getInstance().getBundle()
							.getBundleContext()
							.installBundle(bundleLocation + "/" + parts[0]);

				} catch (Exception e) {
					// dont do anything, it normal that most parts can not be
					// loaded
				}
			}

			// install all bundles in the workspace (maybe needed depency)

			/*
			 * IPluginModelBase[] candidates =
			 * PluginRegistry.getWorkspaceModels(); for(IPluginModelBase
			 * candidate : candidates) { IResource candidateManifest =
			 * candidate.getUnderlyingResource();
			 * 
			 * String candidateLocationReference = "reference:" +
			 * candidateManifest
			 * .getProject().getLocationURI().toURL().toExternalForm();
			 * 
			 * Bundle installedBundle =
			 * PluginActivator.getInstance().getBundle()
			 * .getBundleContext().installBundle(candidateLocationReference);
			 * installedBundle.update();
			 * 
			 * 
			 * // add the bin folder as classpath to the project IProject
			 * project = candidateManifest.getProject(); IJavaProject
			 * javaProject = JavaCore.create(project); try { IPath output =
			 * javaProject.getOutputLocation(); BaseData bundleData =
			 * (BaseData)((AbstractBundle)installedBundle).getBundleData();
			 * //bundleData
			 * .setClassPathString(output.removeFirstSegments(1).toString());
			 * bundleData.setClassPathString("/bin"); } catch
			 * (JavaModelException e) { System.out.println(e); }
			 * 
			 * }
			 */

		} catch (Exception e) {
			Status s = new Status(IStatus.ERROR, "not_used", e.toString(), null);
			StatusManager.getManager().handle(s, StatusManager.SHOW);
			// System.out.println(e);
		}
		return retBundle;
	}

	/**
	 * looks for a 'bin' entry in the given manifest and adds it if necessary
	 * 
	 * @param uri
	 *            the uri to the bundles manifest
	 * 
	 * @throws IOException
	 */
	private static void addBinToManifestClassPath(URI uri) {
		try {

			Manifest m = new Manifest(
					URIConverter.INSTANCE.createInputStream(uri));

			// is there a classpath entry?
			boolean found = false;
			for (Object o : m.getMainAttributes().keySet()) {
				if (o.toString().equals("Bundle-ClassPath")) {
					// is the bin folder in this classpath?
					String oldVal = m.getMainAttributes().get(o).toString();

					if (!oldVal.contains("bin")) {
						m.getMainAttributes().putValue("Bundle-ClassPath",
								oldVal + ", bin");
						found = true;
						break;
					}
				}
			}
			if (!found) {
				m.getMainAttributes().putValue("Bundle-ClassPath", "., bin");
			}

			m.write(URIConverter.INSTANCE.createOutputStream(uri));
		} catch (Exception e) {
			Status s = new Status(
					IStatus.ERROR,
					"not_used",
					"Could not add the bin folder to the projects manifest file",
					null);
			StatusManager.getManager().handle(s, StatusManager.SHOW);
		}
	}

	/**
	 * Convenience method to get access to the java model.
	 */
	private static IJavaModel getJavaModel() {
		return JavaCore.create(getWorkspaceRoot());
	}

	/**
	 * Convenience method to get the workspace root.
	 */
	private static IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
}
