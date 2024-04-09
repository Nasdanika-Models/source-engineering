/**
 */
package org.nasdanika.models.source.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.source.Position;
import org.nasdanika.models.source.Range;
import org.nasdanika.models.source.Source;
import org.nasdanika.models.source.SourcePackage;
import org.nasdanika.ncore.Marker;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.source.impl.RangeImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.models.source.impl.RangeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.nasdanika.models.source.impl.RangeImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeImpl extends MinimalEObjectImpl.Container implements Range {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(SourcePackage.RANGE__MARKERS, NcorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getBegin() {
		return (Position)eDynamicGet(SourcePackage.RANGE__BEGIN, SourcePackage.Literals.RANGE__BEGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegin(Position newBegin, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBegin, SourcePackage.RANGE__BEGIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegin(Position newBegin) {
		eDynamicSet(SourcePackage.RANGE__BEGIN, SourcePackage.Literals.RANGE__BEGIN, newBegin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getEnd() {
		return (Position)eDynamicGet(SourcePackage.RANGE__END, SourcePackage.Literals.RANGE__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Position newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, SourcePackage.RANGE__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Position newEnd) {
		eDynamicSet(SourcePackage.RANGE__END, SourcePackage.Literals.RANGE__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean contains(Range range) {
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
	public boolean contains(Position position) {
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
	public boolean overlaps(Range range) {
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
	public String text(String source) {
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
	public String text(Source source) {
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
	public Range offset(Position position) {
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
			case SourcePackage.RANGE__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
			case SourcePackage.RANGE__BEGIN:
				return basicSetBegin(null, msgs);
			case SourcePackage.RANGE__END:
				return basicSetEnd(null, msgs);
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
			case SourcePackage.RANGE__MARKERS:
				return getMarkers();
			case SourcePackage.RANGE__BEGIN:
				return getBegin();
			case SourcePackage.RANGE__END:
				return getEnd();
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
			case SourcePackage.RANGE__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case SourcePackage.RANGE__BEGIN:
				setBegin((Position)newValue);
				return;
			case SourcePackage.RANGE__END:
				setEnd((Position)newValue);
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
			case SourcePackage.RANGE__MARKERS:
				getMarkers().clear();
				return;
			case SourcePackage.RANGE__BEGIN:
				setBegin((Position)null);
				return;
			case SourcePackage.RANGE__END:
				setEnd((Position)null);
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
			case SourcePackage.RANGE__MARKERS:
				return !getMarkers().isEmpty();
			case SourcePackage.RANGE__BEGIN:
				return getBegin() != null;
			case SourcePackage.RANGE__END:
				return getEnd() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SourcePackage.RANGE___CONTAINS__RANGE:
				return contains((Range)arguments.get(0));
			case SourcePackage.RANGE___CONTAINS__POSITION:
				return contains((Position)arguments.get(0));
			case SourcePackage.RANGE___OVERLAPS__RANGE:
				return overlaps((Range)arguments.get(0));
			case SourcePackage.RANGE___TEXT__STRING:
				return text((String)arguments.get(0));
			case SourcePackage.RANGE___TEXT__SOURCE:
				return text((Source)arguments.get(0));
			case SourcePackage.RANGE___OFFSET__POSITION:
				return offset((Position)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RangeImpl
