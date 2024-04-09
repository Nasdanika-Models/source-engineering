/**
 */
package org.nasdanika.models.source;

import org.nasdanika.ncore.Marked;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.source.Range#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.nasdanika.models.source.Range#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.source.SourcePackage#getRange()
 * @model
 * @generated
 */
public interface Range extends Marked {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(Position)
	 * @see org.nasdanika.models.source.SourcePackage#getRange_Begin()
	 * @model containment="true"
	 * @generated
	 */
	Position getBegin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.source.Range#getBegin <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Position value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Position)
	 * @see org.nasdanika.models.source.SourcePackage#getRange_End()
	 * @model containment="true"
	 * @generated
	 */
	Position getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.source.Range#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Position value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean contains(Range range);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean contains(Position position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean overlaps(Range range);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String text(String source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String text(Source source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Range offset(Position position);

} // Range
