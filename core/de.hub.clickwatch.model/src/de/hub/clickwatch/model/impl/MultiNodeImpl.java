/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.MultiNode;
import de.hub.clickwatch.model.Node;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.impl.MultiNodeImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiNodeImpl extends NodeImpl implements MultiNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClickWatchModelPackage.Literals.MULTI_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getNodes() {
		return (EList<Node>)eGet(ClickWatchModelPackage.Literals.MULTI_NODE__NODES, true);
	}

} //MultiNodeImpl
