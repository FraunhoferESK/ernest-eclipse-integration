/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer Institute for Embedded Systems and
 * Communication Technologies ESK
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file is part of ERNEST.
 *
 * Contributors:
 * Fraunhofer ESK - initial API and implementation
 *******************************************************************************/
package ernest.impl;

import ernest.ErnestPackage;
import ernest.Model;

import ernest.architecture.StructureModel;

import ernest.timingspecification.TimingModel;

import ernest.tracing.TracingResults;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.impl.ModelImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ernest.impl.ModelImpl#getStructureModel <em>Structure Model</em>}</li>
 *   <li>{@link ernest.impl.ModelImpl#getTimingModel <em>Timing Model</em>}</li>
 *   <li>{@link ernest.impl.ModelImpl#getTracingResults <em>Tracing Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructureModel() <em>Structure Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureModel()
	 * @generated
	 * @ordered
	 */
	protected StructureModel structureModel;

	/**
	 * The cached value of the '{@link #getTimingModel() <em>Timing Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingModel()
	 * @generated
	 * @ordered
	 */
	protected TimingModel timingModel;

	/**
	 * The cached value of the '{@link #getTracingResults() <em>Tracing Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracingResults()
	 * @generated
	 * @ordered
	 */
	protected TracingResults tracingResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErnestPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErnestPackage.MODEL__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureModel getStructureModel() {
		return structureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureModel(StructureModel newStructureModel, NotificationChain msgs) {
		StructureModel oldStructureModel = structureModel;
		structureModel = newStructureModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErnestPackage.MODEL__STRUCTURE_MODEL, oldStructureModel, newStructureModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureModel(StructureModel newStructureModel) {
		if (newStructureModel != structureModel) {
			NotificationChain msgs = null;
			if (structureModel != null)
				msgs = ((InternalEObject)structureModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErnestPackage.MODEL__STRUCTURE_MODEL, null, msgs);
			if (newStructureModel != null)
				msgs = ((InternalEObject)newStructureModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErnestPackage.MODEL__STRUCTURE_MODEL, null, msgs);
			msgs = basicSetStructureModel(newStructureModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErnestPackage.MODEL__STRUCTURE_MODEL, newStructureModel, newStructureModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingModel getTimingModel() {
		return timingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingModel(TimingModel newTimingModel, NotificationChain msgs) {
		TimingModel oldTimingModel = timingModel;
		timingModel = newTimingModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErnestPackage.MODEL__TIMING_MODEL, oldTimingModel, newTimingModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingModel(TimingModel newTimingModel) {
		if (newTimingModel != timingModel) {
			NotificationChain msgs = null;
			if (timingModel != null)
				msgs = ((InternalEObject)timingModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErnestPackage.MODEL__TIMING_MODEL, null, msgs);
			if (newTimingModel != null)
				msgs = ((InternalEObject)newTimingModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErnestPackage.MODEL__TIMING_MODEL, null, msgs);
			msgs = basicSetTimingModel(newTimingModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErnestPackage.MODEL__TIMING_MODEL, newTimingModel, newTimingModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingResults getTracingResults() {
		return tracingResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTracingResults(TracingResults newTracingResults, NotificationChain msgs) {
		TracingResults oldTracingResults = tracingResults;
		tracingResults = newTracingResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErnestPackage.MODEL__TRACING_RESULTS, oldTracingResults, newTracingResults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTracingResults(TracingResults newTracingResults) {
		if (newTracingResults != tracingResults) {
			NotificationChain msgs = null;
			if (tracingResults != null)
				msgs = ((InternalEObject)tracingResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErnestPackage.MODEL__TRACING_RESULTS, null, msgs);
			if (newTracingResults != null)
				msgs = ((InternalEObject)newTracingResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErnestPackage.MODEL__TRACING_RESULTS, null, msgs);
			msgs = basicSetTracingResults(newTracingResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErnestPackage.MODEL__TRACING_RESULTS, newTracingResults, newTracingResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErnestPackage.MODEL__STRUCTURE_MODEL:
				return basicSetStructureModel(null, msgs);
			case ErnestPackage.MODEL__TIMING_MODEL:
				return basicSetTimingModel(null, msgs);
			case ErnestPackage.MODEL__TRACING_RESULTS:
				return basicSetTracingResults(null, msgs);
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
			case ErnestPackage.MODEL__TITLE:
				return getTitle();
			case ErnestPackage.MODEL__STRUCTURE_MODEL:
				return getStructureModel();
			case ErnestPackage.MODEL__TIMING_MODEL:
				return getTimingModel();
			case ErnestPackage.MODEL__TRACING_RESULTS:
				return getTracingResults();
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
			case ErnestPackage.MODEL__TITLE:
				setTitle((String)newValue);
				return;
			case ErnestPackage.MODEL__STRUCTURE_MODEL:
				setStructureModel((StructureModel)newValue);
				return;
			case ErnestPackage.MODEL__TIMING_MODEL:
				setTimingModel((TimingModel)newValue);
				return;
			case ErnestPackage.MODEL__TRACING_RESULTS:
				setTracingResults((TracingResults)newValue);
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
			case ErnestPackage.MODEL__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ErnestPackage.MODEL__STRUCTURE_MODEL:
				setStructureModel((StructureModel)null);
				return;
			case ErnestPackage.MODEL__TIMING_MODEL:
				setTimingModel((TimingModel)null);
				return;
			case ErnestPackage.MODEL__TRACING_RESULTS:
				setTracingResults((TracingResults)null);
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
			case ErnestPackage.MODEL__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ErnestPackage.MODEL__STRUCTURE_MODEL:
				return structureModel != null;
			case ErnestPackage.MODEL__TIMING_MODEL:
				return timingModel != null;
			case ErnestPackage.MODEL__TRACING_RESULTS:
				return tracingResults != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
