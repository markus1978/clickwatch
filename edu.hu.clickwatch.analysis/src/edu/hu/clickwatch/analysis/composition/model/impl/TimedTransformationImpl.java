/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.hu.clickwatch.analysis.composition.model.CompositionPackage;
import edu.hu.clickwatch.analysis.composition.model.ParameterSpec;
import edu.hu.clickwatch.analysis.composition.model.TargetSpec;
import edu.hu.clickwatch.analysis.composition.model.TimedTransformation;
import edu.hu.clickwatch.analysis.composition.model.Transformation;
import edu.hu.clickwatch.analysis.composition.model.TransformationKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getTransformationUri <em>Transformation Uri</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getTransformationFunction <em>Transformation Function</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getPredefinedTransformation <em>Predefined Transformation</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getTargetSpec <em>Target Spec</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getRequiredBundle <em>Required Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimedTransformationImpl extends EdgeImpl implements TimedTransformation {
	/**
	 * The default value of the '{@link #getTransformationUri() <em>Transformation Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransformationUri() <em>Transformation Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationUri()
	 * @generated
	 * @ordered
	 */
	protected String transformationUri = TRANSFORMATION_URI_EDEFAULT;
	/**
	 * The default value of the '{@link #getTransformationFunction() <em>Transformation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_FUNCTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransformationFunction() <em>Transformation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationFunction()
	 * @generated
	 * @ordered
	 */
	protected String transformationFunction = TRANSFORMATION_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransformationKind KIND_EDEFAULT = TransformationKind.PREDEFINED;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransformationKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredefinedTransformation() <em>Predefined Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedTransformation()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDEFINED_TRANSFORMATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPredefinedTransformation() <em>Predefined Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedTransformation()
	 * @generated
	 * @ordered
	 */
	protected String predefinedTransformation = PREDEFINED_TRANSFORMATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected ParameterSpec input;
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected ParameterSpec output;
	/**
	 * The default value of the '{@link #getTargetSpec() <em>Target Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSpec()
	 * @generated
	 * @ordered
	 */
	protected static final TargetSpec TARGET_SPEC_EDEFAULT = TargetSpec.ADD;
	/**
	 * The cached value of the '{@link #getTargetSpec() <em>Target Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSpec()
	 * @generated
	 * @ordered
	 */
	protected TargetSpec targetSpec = TARGET_SPEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredBundle() <em>Required Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBundle()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_BUNDLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRequiredBundle() <em>Required Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBundle()
	 * @generated
	 * @ordered
	 */
	protected String requiredBundle = REQUIRED_BUNDLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.TIMED_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformationUri() {
		return transformationUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationUri(String newTransformationUri) {
		String oldTransformationUri = transformationUri;
		transformationUri = newTransformationUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI, oldTransformationUri, transformationUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformationFunction() {
		return transformationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationFunction(String newTransformationFunction) {
		String oldTransformationFunction = transformationFunction;
		transformationFunction = newTransformationFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION, oldTransformationFunction, transformationFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TransformationKind newKind) {
		TransformationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredefinedTransformation() {
		return predefinedTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedTransformation(String newPredefinedTransformation) {
		String oldPredefinedTransformation = predefinedTransformation;
		predefinedTransformation = newPredefinedTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION, oldPredefinedTransformation, predefinedTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSpec getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(ParameterSpec newInput, NotificationChain msgs) {
		ParameterSpec oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(ParameterSpec newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.TIMED_TRANSFORMATION__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.TIMED_TRANSFORMATION__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSpec getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(ParameterSpec newOutput, NotificationChain msgs) {
		ParameterSpec oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(ParameterSpec newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.TIMED_TRANSFORMATION__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.TIMED_TRANSFORMATION__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetSpec getTargetSpec() {
		return targetSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSpec(TargetSpec newTargetSpec) {
		TargetSpec oldTargetSpec = targetSpec;
		targetSpec = newTargetSpec == null ? TARGET_SPEC_EDEFAULT : newTargetSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__TARGET_SPEC, oldTargetSpec, targetSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredBundle() {
		return requiredBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBundle(String newRequiredBundle) {
		String oldRequiredBundle = requiredBundle;
		requiredBundle = newRequiredBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__REQUIRED_BUNDLE, oldRequiredBundle, requiredBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.TIMED_TRANSFORMATION__INPUT:
				return basicSetInput(null, msgs);
			case CompositionPackage.TIMED_TRANSFORMATION__OUTPUT:
				return basicSetOutput(null, msgs);
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
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI:
				return getTransformationUri();
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION:
				return getTransformationFunction();
			case CompositionPackage.TIMED_TRANSFORMATION__KIND:
				return getKind();
			case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				return getPredefinedTransformation();
			case CompositionPackage.TIMED_TRANSFORMATION__INPUT:
				return getInput();
			case CompositionPackage.TIMED_TRANSFORMATION__OUTPUT:
				return getOutput();
			case CompositionPackage.TIMED_TRANSFORMATION__TARGET_SPEC:
				return getTargetSpec();
			case CompositionPackage.TIMED_TRANSFORMATION__REQUIRED_BUNDLE:
				return getRequiredBundle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI:
				setTransformationUri((String)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION:
				setTransformationFunction((String)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__KIND:
				setKind((TransformationKind)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				setPredefinedTransformation((String)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__INPUT:
				setInput((ParameterSpec)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__OUTPUT:
				setOutput((ParameterSpec)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__TARGET_SPEC:
				setTargetSpec((TargetSpec)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__REQUIRED_BUNDLE:
				setRequiredBundle((String)newValue);
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
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI:
				setTransformationUri(TRANSFORMATION_URI_EDEFAULT);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION:
				setTransformationFunction(TRANSFORMATION_FUNCTION_EDEFAULT);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				setPredefinedTransformation(PREDEFINED_TRANSFORMATION_EDEFAULT);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__INPUT:
				setInput((ParameterSpec)null);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__OUTPUT:
				setOutput((ParameterSpec)null);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__TARGET_SPEC:
				setTargetSpec(TARGET_SPEC_EDEFAULT);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__REQUIRED_BUNDLE:
				setRequiredBundle(REQUIRED_BUNDLE_EDEFAULT);
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
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI:
				return TRANSFORMATION_URI_EDEFAULT == null ? transformationUri != null : !TRANSFORMATION_URI_EDEFAULT.equals(transformationUri);
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION:
				return TRANSFORMATION_FUNCTION_EDEFAULT == null ? transformationFunction != null : !TRANSFORMATION_FUNCTION_EDEFAULT.equals(transformationFunction);
			case CompositionPackage.TIMED_TRANSFORMATION__KIND:
				return kind != KIND_EDEFAULT;
			case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				return PREDEFINED_TRANSFORMATION_EDEFAULT == null ? predefinedTransformation != null : !PREDEFINED_TRANSFORMATION_EDEFAULT.equals(predefinedTransformation);
			case CompositionPackage.TIMED_TRANSFORMATION__INPUT:
				return input != null;
			case CompositionPackage.TIMED_TRANSFORMATION__OUTPUT:
				return output != null;
			case CompositionPackage.TIMED_TRANSFORMATION__TARGET_SPEC:
				return targetSpec != TARGET_SPEC_EDEFAULT;
			case CompositionPackage.TIMED_TRANSFORMATION__REQUIRED_BUNDLE:
				return REQUIRED_BUNDLE_EDEFAULT == null ? requiredBundle != null : !REQUIRED_BUNDLE_EDEFAULT.equals(requiredBundle);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Transformation.class) {
			switch (derivedFeatureID) {
				case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI: return CompositionPackage.TRANSFORMATION__TRANSFORMATION_URI;
				case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION: return CompositionPackage.TRANSFORMATION__TRANSFORMATION_FUNCTION;
				case CompositionPackage.TIMED_TRANSFORMATION__KIND: return CompositionPackage.TRANSFORMATION__KIND;
				case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION: return CompositionPackage.TRANSFORMATION__PREDEFINED_TRANSFORMATION;
				case CompositionPackage.TIMED_TRANSFORMATION__INPUT: return CompositionPackage.TRANSFORMATION__INPUT;
				case CompositionPackage.TIMED_TRANSFORMATION__OUTPUT: return CompositionPackage.TRANSFORMATION__OUTPUT;
				case CompositionPackage.TIMED_TRANSFORMATION__TARGET_SPEC: return CompositionPackage.TRANSFORMATION__TARGET_SPEC;
				case CompositionPackage.TIMED_TRANSFORMATION__REQUIRED_BUNDLE: return CompositionPackage.TRANSFORMATION__REQUIRED_BUNDLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Transformation.class) {
			switch (baseFeatureID) {
				case CompositionPackage.TRANSFORMATION__TRANSFORMATION_URI: return CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI;
				case CompositionPackage.TRANSFORMATION__TRANSFORMATION_FUNCTION: return CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION;
				case CompositionPackage.TRANSFORMATION__KIND: return CompositionPackage.TIMED_TRANSFORMATION__KIND;
				case CompositionPackage.TRANSFORMATION__PREDEFINED_TRANSFORMATION: return CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION;
				case CompositionPackage.TRANSFORMATION__INPUT: return CompositionPackage.TIMED_TRANSFORMATION__INPUT;
				case CompositionPackage.TRANSFORMATION__OUTPUT: return CompositionPackage.TIMED_TRANSFORMATION__OUTPUT;
				case CompositionPackage.TRANSFORMATION__TARGET_SPEC: return CompositionPackage.TIMED_TRANSFORMATION__TARGET_SPEC;
				case CompositionPackage.TRANSFORMATION__REQUIRED_BUNDLE: return CompositionPackage.TIMED_TRANSFORMATION__REQUIRED_BUNDLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (transformationUri: ");
		result.append(transformationUri);
		result.append(", transformationFunction: ");
		result.append(transformationFunction);
		result.append(", kind: ");
		result.append(kind);
		result.append(", predefinedTransformation: ");
		result.append(predefinedTransformation);
		result.append(", targetSpec: ");
		result.append(targetSpec);
		result.append(", requiredBundle: ");
		result.append(requiredBundle);
		result.append(')');
		return result.toString();
	}

} //TimedTransformationImpl
