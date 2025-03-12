/**
 */
package org.nasdanika.models.source.impl;

import java.lang.Comparable;

import java.util.function.Function;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.source.GenerationMode;
import org.nasdanika.models.source.NamedElement;
import org.nasdanika.models.source.Position;
import org.nasdanika.models.source.Range;
import org.nasdanika.models.source.Source;
import org.nasdanika.models.source.SourceFactory;
import org.nasdanika.models.source.SourcePackage;

import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourcePackageImpl extends EPackageImpl implements SourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generationModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.source.SourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SourcePackageImpl() {
		super(eNS_URI, SourceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SourcePackage init() {
		if (isInited) return (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSourcePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SourcePackageImpl theSourcePackage = registeredSourcePackage instanceof SourcePackageImpl ? (SourcePackageImpl)registeredSourcePackage : new SourcePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSourcePackage.createPackageContents();

		// Initialize created meta-data
		theSourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSourcePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SourcePackage.eNS_URI, theSourcePackage);
		return theSourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTokenSource() {
		return tokenSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparable() {
		return comparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Line() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Column() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Exclusive() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRange_Begin() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRange_End() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRange__Contains__Range() {
		return rangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRange__Contains__Position() {
		return rangeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRange__Overlaps__Range() {
		return rangeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRange__Text__String() {
		return rangeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRange__Text__Source() {
		return rangeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRange__Offset__Position() {
		return rangeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_Source() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_Children() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_Indent() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_Interpolate() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_GenerationMode() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSource__Generate__Function_int() {
		return sourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGenerationMode() {
		return generationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceFactory getSourceFactory() {
		return (SourceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tokenSourceEClass = createEClass(TOKEN_SOURCE);

		comparableEClass = createEClass(COMPARABLE);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__LINE);
		createEAttribute(positionEClass, POSITION__COLUMN);
		createEAttribute(positionEClass, POSITION__EXCLUSIVE);

		rangeEClass = createEClass(RANGE);
		createEReference(rangeEClass, RANGE__BEGIN);
		createEReference(rangeEClass, RANGE__END);
		createEOperation(rangeEClass, RANGE___CONTAINS__RANGE);
		createEOperation(rangeEClass, RANGE___CONTAINS__POSITION);
		createEOperation(rangeEClass, RANGE___OVERLAPS__RANGE);
		createEOperation(rangeEClass, RANGE___TEXT__STRING);
		createEOperation(rangeEClass, RANGE___TEXT__SOURCE);
		createEOperation(rangeEClass, RANGE___OFFSET__POSITION);

		sourceEClass = createEClass(SOURCE);
		createEAttribute(sourceEClass, SOURCE__SOURCE);
		createEReference(sourceEClass, SOURCE__CHILDREN);
		createEAttribute(sourceEClass, SOURCE__INDENT);
		createEAttribute(sourceEClass, SOURCE__INTERPOLATE);
		createEAttribute(sourceEClass, SOURCE__GENERATION_MODE);
		createEOperation(sourceEClass, SOURCE___GENERATE__FUNCTION_INT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		generationModeEEnum = createEEnum(GENERATION_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(comparableEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getComparable());
		EGenericType g2 = createEGenericType(this.getPosition());
		g1.getETypeArguments().add(g2);
		positionEClass.getEGenericSuperTypes().add(g1);
		rangeEClass.getESuperTypes().add(theNcorePackage.getMarked());
		sourceEClass.getESuperTypes().add(this.getRange());
		namedElementEClass.getESuperTypes().add(this.getSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(tokenSourceEClass, Function.class, "TokenSource", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.util.function.Function<String, String>");

		initEClass(comparableEClass, Comparable.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Line(), ecorePackage.getEInt(), "line", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Column(), ecorePackage.getEInt(), "column", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Exclusive(), ecorePackage.getEBoolean(), "exclusive", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRange_Begin(), this.getPosition(), null, "begin", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRange_End(), this.getPosition(), null, "end", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRange__Contains__Range(), ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRange(), "range", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRange__Contains__Position(), ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRange__Overlaps__Range(), ecorePackage.getEBoolean(), "overlaps", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRange(), "range", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRange__Text__String(), ecorePackage.getEString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRange__Text__Source(), ecorePackage.getEString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSource(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRange__Offset__Position(), this.getRange(), "offset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSource_Source(), ecorePackage.getEString(), "source", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Children(), this.getSource(), null, "children", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Indent(), ecorePackage.getEString(), "indent", "    ", 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Interpolate(), ecorePackage.getEBoolean(), "interpolate", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_GenerationMode(), this.getGenerationMode(), "generationMode", "MERGE", 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSource__Generate__Function_int(), ecorePackage.getEString(), "generate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTokenSource(), "tokenSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "indent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(generationModeEEnum, GenerationMode.class, "GenerationMode");
		addEEnumLiteral(generationModeEEnum, GenerationMode.NONE);
		addEEnumLiteral(generationModeEEnum, GenerationMode.SOURCE);
		addEEnumLiteral(generationModeEEnum, GenerationMode.CONTENTS);
		addEEnumLiteral(generationModeEEnum, GenerationMode.CONCATENATE);
		addEEnumLiteral(generationModeEEnum, GenerationMode.MERGE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (generationModeEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines how own source and contents are usd by the generate() method"
		   });
		addAnnotation
		  (generationModeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Skip this source during generation"
		   });
		addAnnotation
		  (generationModeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Use only own source, ingnore contents"
		   });
		addAnnotation
		  (generationModeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Do not use own source, generate from contents"
		   });
		addAnnotation
		  (generationModeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Concatenate own source with source generated by contents"
		   });
		addAnnotation
		  (generationModeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Own source (original) is merged with new source generated from contents"
		   });
		addAnnotation
		  (getSource__Generate__Function_int(),
		   source,
		   new String[] {
			   "documentation", "Generates source code"
		   });
	}

} //SourcePackageImpl
