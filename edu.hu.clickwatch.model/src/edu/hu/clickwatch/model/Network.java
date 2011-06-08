/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.model;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Network#getName <em>Name</em>}</li>
 *   <li>{@link model.Network#getNodes <em>Nodes</em>}</li>
 *   <li>{@link model.Network#getAll <em>All</em>}</li>
 *   <li>{@link model.Network#getElementFilter <em>Element Filter</em>}</li>
 *   <li>{@link model.Network#getHandlerFilter <em>Handler Filter</em>}</li>
 *   <li>{@link model.Network#getUpdateIntervall <em>Update Intervall</em>}</li>
 *   <li>{@link model.Network#getSubnetworks <em>Subnetworks</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ClickWatchModelPackage#getNetwork()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Network extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"My Network"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ClickWatchModelPackage#getNetwork_Name()
	 * @model default="My Network"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link model.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see model.ClickWatchModelPackage#getNetwork_Nodes()
	 * @model containment="true"
	 *        extendedMetaData="name='node' kind='element'"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All</em>' containment reference.
	 * @see #setAll(MultiNode)
	 * @see model.ClickWatchModelPackage#getNetwork_All()
	 * @model containment="true"
	 * @generated
	 */
	MultiNode getAll();

	/**
	 * Sets the value of the '{@link model.Network#getAll <em>All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All</em>' containment reference.
	 * @see #getAll()
	 * @generated
	 */
	void setAll(MultiNode value);

	/**
	 * Returns the value of the '<em><b>Element Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Filter</em>' attribute.
	 * @see #setElementFilter(String)
	 * @see model.ClickWatchModelPackage#getNetwork_ElementFilter()
	 * @model
	 * @generated
	 */
	String getElementFilter();

	/**
	 * Sets the value of the '{@link model.Network#getElementFilter <em>Element Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Filter</em>' attribute.
	 * @see #getElementFilter()
	 * @generated
	 */
	void setElementFilter(String value);

	/**
	 * Returns the value of the '<em><b>Handler Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Filter</em>' attribute.
	 * @see #setHandlerFilter(String)
	 * @see model.ClickWatchModelPackage#getNetwork_HandlerFilter()
	 * @model
	 * @generated
	 */
	String getHandlerFilter();

	/**
	 * Sets the value of the '{@link model.Network#getHandlerFilter <em>Handler Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Filter</em>' attribute.
	 * @see #getHandlerFilter()
	 * @generated
	 */
	void setHandlerFilter(String value);

	/**
	 * Returns the value of the '<em><b>Update Intervall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Intervall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Intervall</em>' attribute.
	 * @see #setUpdateIntervall(int)
	 * @see model.ClickWatchModelPackage#getNetwork_UpdateIntervall()
	 * @model
	 * @generated
	 */
	int getUpdateIntervall();

	/**
	 * Sets the value of the '{@link model.Network#getUpdateIntervall <em>Update Intervall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Intervall</em>' attribute.
	 * @see #getUpdateIntervall()
	 * @generated
	 */
	void setUpdateIntervall(int value);

	/**
	 * Returns the value of the '<em><b>Subnetworks</b></em>' containment reference list.
	 * The list contents are of type {@link model.Network}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnetworks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnetworks</em>' containment reference list.
	 * @see model.ClickWatchModelPackage#getNetwork_Subnetworks()
	 * @model containment="true"
	 *        extendedMetaData="name='subnetwork' kind='element'"
	 * @generated
	 */
	EList<Network> getSubnetworks();

} // Network
