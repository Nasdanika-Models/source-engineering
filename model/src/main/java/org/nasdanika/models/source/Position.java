/**
 */
package org.nasdanika.models.source;

import java.lang.Comparable;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.source.Position#getLine <em>Line</em>}</li>
 *   <li>{@link org.nasdanika.models.source.Position#getColumn <em>Column</em>}</li>
 *   <li>{@link org.nasdanika.models.source.Position#isExclusive <em>Exclusive</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.source.SourcePackage#getPosition()
 * @model superTypes="org.nasdanika.models.source.Comparable&lt;org.nasdanika.models.source.Position&gt;"
 * @generated
 */
public interface Position extends EObject, Comparable<Position> {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see org.nasdanika.models.source.SourcePackage#getPosition_Line()
	 * @model
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.source.Position#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see org.nasdanika.models.source.SourcePackage#getPosition_Column()
	 * @model
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.source.Position#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);
	
	/**
	 * Returns the value of the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive</em>' attribute.
	 * @see #setExclusive(boolean)
	 * @see org.nasdanika.models.source.SourcePackage#getPosition_Exclusive()
	 * @model
	 * @generated
	 */
	boolean isExclusive();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.source.Position#isExclusive <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive</em>' attribute.
	 * @see #isExclusive()
	 * @generated
	 */
	void setExclusive(boolean value);

	@Override
	default int compareTo(Position o) {
		if (o == null) {
			return -1;
		}
		int lineDiff = getLine() - o.getLine();
		if (lineDiff != 0) {
			return lineDiff;
		}
		return getColumn() - o.getColumn();
	}

} // Position
