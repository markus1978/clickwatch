/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.model.BackboneType;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getINetAddress <em>INet Address</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getBackbone <em>Backbone</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#isRetrieving <em>Retrieving</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#isHasRecord <em>Has Record</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#isRecording <em>Recording</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getINetAddress() <em>INet Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINetAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String INET_ADDRESS_EDEFAULT = "localhost";
	/**
	 * The cached value of the '{@link #getINetAddress() <em>INet Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINetAddress()
	 * @generated
	 * @ordered
	 */
	protected String iNetAddress = INET_ADDRESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = "7777";
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;
	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;
	/**
	 * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONNECTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Object connection = CONNECTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getBackbone() <em>Backbone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackbone()
	 * @generated
	 * @ordered
	 */
	protected static final BackboneType BACKBONE_EDEFAULT = BackboneType.UNKNOWN;
	/**
	 * The cached value of the '{@link #getBackbone() <em>Backbone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackbone()
	 * @generated
	 * @ordered
	 */
	protected BackboneType backbone = BACKBONE_EDEFAULT;
	/**
	 * The default value of the '{@link #isRetrieving() <em>Retrieving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetrieving()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETRIEVING_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRetrieving() <em>Retrieving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetrieving()
	 * @generated
	 * @ordered
	 */
	protected boolean retrieving = RETRIEVING_EDEFAULT;
	/**
	 * The default value of the '{@link #isHasRecord() <em>Has Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRecord()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_RECORD_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHasRecord() <em>Has Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRecord()
	 * @generated
	 * @ordered
	 */
	protected boolean hasRecord = HAS_RECORD_EDEFAULT;
	/**
	 * The default value of the '{@link #isRecording() <em>Recording</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecording()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECORDING_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRecording() <em>Recording</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecording()
	 * @generated
	 * @ordered
	 */
	protected boolean recording = RECORDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClickWatchModelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getINetAddress() {
		return iNetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINetAddress(String newINetAddress) {
		String oldINetAddress = iNetAddress;
		iNetAddress = newINetAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__INET_ADDRESS, oldINetAddress, iNetAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, ClickWatchModelPackage.NODE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Object newConnection) {
		Object oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneType getBackbone() {
		return backbone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackbone(BackboneType newBackbone) {
		BackboneType oldBackbone = backbone;
		backbone = newBackbone == null ? BACKBONE_EDEFAULT : newBackbone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__BACKBONE, oldBackbone, backbone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRetrieving() {
		return retrieving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetrieving(boolean newRetrieving) {
		boolean oldRetrieving = retrieving;
		retrieving = newRetrieving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__RETRIEVING, oldRetrieving, retrieving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasRecord() {
		return hasRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRecord(boolean newHasRecord) {
		boolean oldHasRecord = hasRecord;
		hasRecord = newHasRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__HAS_RECORD, oldHasRecord, hasRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRecording() {
		return recording;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecording(boolean newRecording) {
		boolean oldRecording = recording;
		recording = newRecording;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__RECORDING, oldRecording, recording));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void filter(String elemFilters, String handFilter) {
		// filter internal node copy
		if ((elemFilters == null || elemFilters.trim().equals(""))
				&& (handFilter == null || handFilter.trim().equals(""))) {
			return;
		} else {
			if (elemFilters == null) {
				elemFilters = "";
			}
			if (handFilter == null) {
				handFilter = "";
			}
	
			String[] elemFilter = elemFilters.split("/");
			Iterator<Element> elem_it = getElements().iterator();
			
			EList<Handler> result = new BasicEList<Handler>();
			// recursive checker
			filterMatched(elem_it, elemFilter, 0, handFilter, result);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	// recursive filter
	private void filterMatched(Iterator<Element> elem_it, String[] elemFilter,
			int idx, String handFilter, Collection<Handler> result) {
		while (elem_it.hasNext()) {
			Element elem = elem_it.next();
			if ((elemFilter.length > idx)
					&& !java.util.regex.Pattern.compile(elemFilter[idx])
							.matcher(elem.getName()).find()) {		
				elem_it.remove();
				continue; // does not match, no need to check the children nodes
			}
			Iterator<Handler> hand_it = elem.getHandlers().iterator();

			while (hand_it.hasNext()) {
				Handler hand = hand_it.next();
				if (!java.util.regex.Pattern.compile(handFilter)
						.matcher(hand.getName()).find()) {
					// does not match; remove it
					hand_it.remove();
				}
			}

			// recursive call
			if (elem.getChildren().size() > 0) {
				filterMatched(elem.getChildren().iterator(), elemFilter,
						idx + 1, handFilter, result);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Handler getHandler(String qualifiedName) {		
		Handler result = null;
		if (result == null) {
			String[] qualifiedNameItems = qualifiedName.split("/");
			EObject current = this;
			loop: for (int i = 0; i < qualifiedName.length() && current != null; i++) {
				if (qualifiedNameItems.length - i == 1) {
					Preconditions.checkState(current instanceof Element);
					result = ((Element)current).getHandler(qualifiedNameItems[i]);
					break loop;
				} else if (i == 0) {
					Preconditions.checkState(current instanceof Node);
					current = ((Node)current).getElement(qualifiedNameItems[i]);
				} else {
					Preconditions.checkState(current instanceof Element);
					current = ((Element)current).getChild(qualifiedNameItems[i]);
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element getElement(String name) {
		for (Element child: getElements()) {
			if (child.getName().equals(name)) {
				return child;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Handler> getAllHandlers() {
		EList<Handler> result = new BasicEList<Handler>();
		for (Element element: getElements()) {
			result.addAll(element.getAllHandlers());
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void filter() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClickWatchModelPackage.NODE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClickWatchModelPackage.NODE__INET_ADDRESS:
				return getINetAddress();
			case ClickWatchModelPackage.NODE__PORT:
				return getPort();
			case ClickWatchModelPackage.NODE__ELEMENTS:
				return getElements();
			case ClickWatchModelPackage.NODE__CONNECTED:
				return isConnected();
			case ClickWatchModelPackage.NODE__CONNECTION:
				return getConnection();
			case ClickWatchModelPackage.NODE__BACKBONE:
				return getBackbone();
			case ClickWatchModelPackage.NODE__RETRIEVING:
				return isRetrieving();
			case ClickWatchModelPackage.NODE__HAS_RECORD:
				return isHasRecord();
			case ClickWatchModelPackage.NODE__RECORDING:
				return isRecording();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClickWatchModelPackage.NODE__INET_ADDRESS:
				setINetAddress((String)newValue);
				return;
			case ClickWatchModelPackage.NODE__PORT:
				setPort((String)newValue);
				return;
			case ClickWatchModelPackage.NODE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case ClickWatchModelPackage.NODE__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case ClickWatchModelPackage.NODE__CONNECTION:
				setConnection(newValue);
				return;
			case ClickWatchModelPackage.NODE__BACKBONE:
				setBackbone((BackboneType)newValue);
				return;
			case ClickWatchModelPackage.NODE__RETRIEVING:
				setRetrieving((Boolean)newValue);
				return;
			case ClickWatchModelPackage.NODE__HAS_RECORD:
				setHasRecord((Boolean)newValue);
				return;
			case ClickWatchModelPackage.NODE__RECORDING:
				setRecording((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClickWatchModelPackage.NODE__INET_ADDRESS:
				setINetAddress(INET_ADDRESS_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__ELEMENTS:
				getElements().clear();
				return;
			case ClickWatchModelPackage.NODE__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__CONNECTION:
				setConnection(CONNECTION_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__BACKBONE:
				setBackbone(BACKBONE_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__RETRIEVING:
				setRetrieving(RETRIEVING_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__HAS_RECORD:
				setHasRecord(HAS_RECORD_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__RECORDING:
				setRecording(RECORDING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClickWatchModelPackage.NODE__INET_ADDRESS:
				return INET_ADDRESS_EDEFAULT == null ? iNetAddress != null : !INET_ADDRESS_EDEFAULT.equals(iNetAddress);
			case ClickWatchModelPackage.NODE__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ClickWatchModelPackage.NODE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ClickWatchModelPackage.NODE__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case ClickWatchModelPackage.NODE__CONNECTION:
				return CONNECTION_EDEFAULT == null ? connection != null : !CONNECTION_EDEFAULT.equals(connection);
			case ClickWatchModelPackage.NODE__BACKBONE:
				return backbone != BACKBONE_EDEFAULT;
			case ClickWatchModelPackage.NODE__RETRIEVING:
				return retrieving != RETRIEVING_EDEFAULT;
			case ClickWatchModelPackage.NODE__HAS_RECORD:
				return hasRecord != HAS_RECORD_EDEFAULT;
			case ClickWatchModelPackage.NODE__RECORDING:
				return recording != RECORDING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iNetAddress: ");
		result.append(iNetAddress);
		result.append(", port: ");
		result.append(port);
		result.append(", connected: ");
		result.append(connected);
		result.append(", connection: ");
		result.append(connection);
		result.append(", backbone: ");
		result.append(backbone);
		result.append(", retrieving: ");
		result.append(retrieving);
		result.append(", hasRecord: ");
		result.append(hasRecord);
		result.append(", recording: ");
		result.append(recording);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
