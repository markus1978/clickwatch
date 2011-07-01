/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.Edge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends Element {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getEdge_Source()
	 * @model
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getEdge_Target()
	 * @model
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

} // Edge
