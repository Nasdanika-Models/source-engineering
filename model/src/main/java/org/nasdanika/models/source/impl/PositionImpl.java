/**
 */
package org.nasdanika.models.source.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.source.Position;
import org.nasdanika.models.source.SourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.source.impl.PositionImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.nasdanika.models.source.impl.PositionImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.nasdanika.models.source.impl.PositionImpl#isExclusive <em>Exclusive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.POSITION;
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
	@Override
	public int getLine() {
		return (Integer)eDynamicGet(SourcePackage.POSITION__LINE, SourcePackage.Literals.POSITION__LINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine(int newLine) {
		eDynamicSet(SourcePackage.POSITION__LINE, SourcePackage.Literals.POSITION__LINE, newLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColumn() {
		return (Integer)eDynamicGet(SourcePackage.POSITION__COLUMN, SourcePackage.Literals.POSITION__COLUMN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumn(int newColumn) {
		eDynamicSet(SourcePackage.POSITION__COLUMN, SourcePackage.Literals.POSITION__COLUMN, newColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExclusive() {
		return (Boolean)eDynamicGet(SourcePackage.POSITION__EXCLUSIVE, SourcePackage.Literals.POSITION__EXCLUSIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusive(boolean newExclusive) {
		eDynamicSet(SourcePackage.POSITION__EXCLUSIVE, SourcePackage.Literals.POSITION__EXCLUSIVE, newExclusive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SourcePackage.POSITION__LINE:
				return getLine();
			case SourcePackage.POSITION__COLUMN:
				return getColumn();
			case SourcePackage.POSITION__EXCLUSIVE:
				return isExclusive();
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
			case SourcePackage.POSITION__LINE:
				setLine((Integer)newValue);
				return;
			case SourcePackage.POSITION__COLUMN:
				setColumn((Integer)newValue);
				return;
			case SourcePackage.POSITION__EXCLUSIVE:
				setExclusive((Boolean)newValue);
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
			case SourcePackage.POSITION__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case SourcePackage.POSITION__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case SourcePackage.POSITION__EXCLUSIVE:
				setExclusive(EXCLUSIVE_EDEFAULT);
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
			case SourcePackage.POSITION__LINE:
				return getLine() != LINE_EDEFAULT;
			case SourcePackage.POSITION__COLUMN:
				return getColumn() != COLUMN_EDEFAULT;
			case SourcePackage.POSITION__EXCLUSIVE:
				return isExclusive() != EXCLUSIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PositionImpl
