/**
 */
package org.nasdanika.models.source;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.source.SourceFactory
 * @model kind="package"
 * @generated
 */
public interface SourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "source";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/source";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.source";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourcePackage eINSTANCE = org.nasdanika.models.source.impl.SourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link java.util.function.Function <em>Token Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.Function
	 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getTokenSource()
	 * @generated
	 */
	int TOKEN_SOURCE = 0;

	/**
	 * The number of structural features of the '<em>Token Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Token Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Comparable <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Comparable
	 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 1;

	/**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.source.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.source.impl.PositionImpl
	 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LINE = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__COLUMN = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__EXCLUSIVE = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.source.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.source.impl.RangeImpl
	 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MARKERS = NcorePackage.MARKED__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__BEGIN = NcorePackage.MARKED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__END = NcorePackage.MARKED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = NcorePackage.MARKED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___CONTAINS__RANGE = NcorePackage.MARKED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___CONTAINS__POSITION = NcorePackage.MARKED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___OVERLAPS__RANGE = NcorePackage.MARKED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___TEXT__STRING = NcorePackage.MARKED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___TEXT__SOURCE = NcorePackage.MARKED_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___OFFSET__POSITION = NcorePackage.MARKED_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = NcorePackage.MARKED_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.source.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.source.impl.SourceImpl
	 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__MARKERS = RANGE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__BEGIN = RANGE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__END = RANGE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE = RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CHILDREN = RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__INDENT = RANGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__INTERPOLATE = RANGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__GENERATION_MODE = RANGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___CONTAINS__RANGE = RANGE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___CONTAINS__POSITION = RANGE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___OVERLAPS__RANGE = RANGE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___TEXT__STRING = RANGE___TEXT__STRING;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___TEXT__SOURCE = RANGE___TEXT__SOURCE;

	/**
	 * The operation id for the '<em>Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___OFFSET__POSITION = RANGE___OFFSET__POSITION;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___GENERATE__FUNCTION_INT = RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.source.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.source.impl.NamedElementImpl
	 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__MARKERS = SOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__BEGIN = SOURCE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__END = SOURCE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__SOURCE = SOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CHILDREN = SOURCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__INDENT = SOURCE__INDENT;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__INTERPOLATE = SOURCE__INTERPOLATE;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__GENERATION_MODE = SOURCE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___CONTAINS__RANGE = SOURCE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___CONTAINS__POSITION = SOURCE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___OVERLAPS__RANGE = SOURCE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___TEXT__STRING = SOURCE___TEXT__STRING;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___TEXT__SOURCE = SOURCE___TEXT__SOURCE;

	/**
	 * The operation id for the '<em>Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___OFFSET__POSITION = SOURCE___OFFSET__POSITION;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___GENERATE__FUNCTION_INT = SOURCE___GENERATE__FUNCTION_INT;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.source.GenerationMode <em>Generation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.source.GenerationMode
	 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getGenerationMode()
	 * @generated
	 */
	int GENERATION_MODE = 6;


	/**
	 * Returns the meta object for class '{@link java.util.function.Function <em>Token Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Source</em>'.
	 * @see java.util.function.Function
	 * @model instanceClass="java.util.function.Function&lt;String, String&gt;"
	 * @generated
	 */
	EClass getTokenSource();

	/**
	 * Returns the meta object for class '{@link java.lang.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see java.lang.Comparable
	 * @model instanceClass="java.lang.Comparable" typeParameters="T"
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.source.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.nasdanika.models.source.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.source.Position#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.nasdanika.models.source.Position#getLine()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.source.Position#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.nasdanika.models.source.Position#getColumn()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.source.Position#isExclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive</em>'.
	 * @see org.nasdanika.models.source.Position#isExclusive()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Exclusive();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.source.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.nasdanika.models.source.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.source.Range#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see org.nasdanika.models.source.Range#getBegin()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.source.Range#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.nasdanika.models.source.Range#getEnd()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_End();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.source.Range#contains(org.nasdanika.models.source.Range) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see org.nasdanika.models.source.Range#contains(org.nasdanika.models.source.Range)
	 * @generated
	 */
	EOperation getRange__Contains__Range();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.source.Range#contains(org.nasdanika.models.source.Position) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see org.nasdanika.models.source.Range#contains(org.nasdanika.models.source.Position)
	 * @generated
	 */
	EOperation getRange__Contains__Position();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.source.Range#overlaps(org.nasdanika.models.source.Range) <em>Overlaps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Overlaps</em>' operation.
	 * @see org.nasdanika.models.source.Range#overlaps(org.nasdanika.models.source.Range)
	 * @generated
	 */
	EOperation getRange__Overlaps__Range();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.source.Range#text(java.lang.String) <em>Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Text</em>' operation.
	 * @see org.nasdanika.models.source.Range#text(java.lang.String)
	 * @generated
	 */
	EOperation getRange__Text__String();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.source.Range#text(org.nasdanika.models.source.Source) <em>Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Text</em>' operation.
	 * @see org.nasdanika.models.source.Range#text(org.nasdanika.models.source.Source)
	 * @generated
	 */
	EOperation getRange__Text__Source();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.source.Range#offset(org.nasdanika.models.source.Position) <em>Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Offset</em>' operation.
	 * @see org.nasdanika.models.source.Range#offset(org.nasdanika.models.source.Position)
	 * @generated
	 */
	EOperation getRange__Offset__Position();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.source.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.nasdanika.models.source.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.source.Source#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.source.Source#getSource()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.source.Source#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.source.Source#getChildren()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.source.Source#getIndent <em>Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indent</em>'.
	 * @see org.nasdanika.models.source.Source#getIndent()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Indent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.source.Source#isInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see org.nasdanika.models.source.Source#isInterpolate()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Interpolate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.source.Source#getGenerationMode <em>Generation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Mode</em>'.
	 * @see org.nasdanika.models.source.Source#getGenerationMode()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_GenerationMode();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.source.Source#generate(java.util.function.Function, int) <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see org.nasdanika.models.source.Source#generate(java.util.function.Function, int)
	 * @generated
	 */
	EOperation getSource__Generate__Function_int();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.source.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.nasdanika.models.source.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.source.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.source.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.source.GenerationMode <em>Generation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Mode</em>'.
	 * @see org.nasdanika.models.source.GenerationMode
	 * @generated
	 */
	EEnum getGenerationMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SourceFactory getSourceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link java.util.function.Function <em>Token Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.Function
		 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getTokenSource()
		 * @generated
		 */
		EClass TOKEN_SOURCE = eINSTANCE.getTokenSource();

		/**
		 * The meta object literal for the '{@link java.lang.Comparable <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Comparable
		 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.source.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.source.impl.PositionImpl
		 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LINE = eINSTANCE.getPosition_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__COLUMN = eINSTANCE.getPosition_Column();

		/**
		 * The meta object literal for the '<em><b>Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__EXCLUSIVE = eINSTANCE.getPosition_Exclusive();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.source.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.source.impl.RangeImpl
		 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__BEGIN = eINSTANCE.getRange_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__END = eINSTANCE.getRange_End();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___CONTAINS__RANGE = eINSTANCE.getRange__Contains__Range();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___CONTAINS__POSITION = eINSTANCE.getRange__Contains__Position();

		/**
		 * The meta object literal for the '<em><b>Overlaps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___OVERLAPS__RANGE = eINSTANCE.getRange__Overlaps__Range();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___TEXT__STRING = eINSTANCE.getRange__Text__String();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___TEXT__SOURCE = eINSTANCE.getRange__Text__Source();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___OFFSET__POSITION = eINSTANCE.getRange__Offset__Position();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.source.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.source.impl.SourceImpl
		 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SOURCE = eINSTANCE.getSource_Source();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__CHILDREN = eINSTANCE.getSource_Children();

		/**
		 * The meta object literal for the '<em><b>Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__INDENT = eINSTANCE.getSource_Indent();

		/**
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__INTERPOLATE = eINSTANCE.getSource_Interpolate();

		/**
		 * The meta object literal for the '<em><b>Generation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__GENERATION_MODE = eINSTANCE.getSource_GenerationMode();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___GENERATE__FUNCTION_INT = eINSTANCE.getSource__Generate__Function_int();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.source.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.source.impl.NamedElementImpl
		 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.source.GenerationMode <em>Generation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.source.GenerationMode
		 * @see org.nasdanika.models.source.impl.SourcePackageImpl#getGenerationMode()
		 * @generated
		 */
		EEnum GENERATION_MODE = eINSTANCE.getGenerationMode();

	}

} //SourcePackage
