/**
 */
package org.nasdanika.models.source;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Generation Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines how own source and contents are usd by the generate() method
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.source.SourcePackage#getGenerationMode()
 * @model
 * @generated
 */
public enum GenerationMode implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skip this source during generation
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"), /**
	 * The '<em><b>SOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use only own source, ingnore contents
	 * <!-- end-model-doc -->
	 * @see #SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE(1, "SOURCE", "SOURCE"),

	/**
	 * The '<em><b>CONTENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do not use own source, generate from contents
	 * <!-- end-model-doc -->
	 * @see #CONTENTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENTS(2, "CONTENTS", "CONTENTS"),

	/**
	 * The '<em><b>CONCATENATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concatenate own source with source generated by contents
	 * <!-- end-model-doc -->
	 * @see #CONCATENATE_VALUE
	 * @generated
	 * @ordered
	 */
	CONCATENATE(3, "CONCATENATE", "CONCATENATE"), /**
	 * The '<em><b>MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Own source (original) is merged with new source generated from contents
	 * <!-- end-model-doc -->
	 * @see #MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE(4, "MERGE", "MERGE");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skip this source during generation
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>SOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use only own source, ingnore contents
	 * <!-- end-model-doc -->
	 * @see #SOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_VALUE = 1;

	/**
	 * The '<em><b>CONTENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do not use own source, generate from contents
	 * <!-- end-model-doc -->
	 * @see #CONTENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTENTS_VALUE = 2;

	/**
	 * The '<em><b>CONCATENATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concatenate own source with source generated by contents
	 * <!-- end-model-doc -->
	 * @see #CONCATENATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONCATENATE_VALUE = 3;

	/**
	 * The '<em><b>MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Own source (original) is merged with new source generated from contents
	 * <!-- end-model-doc -->
	 * @see #MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Generation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenerationMode[] VALUES_ARRAY =
		new GenerationMode[] {
			NONE,
			SOURCE,
			CONTENTS,
			CONCATENATE,
			MERGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Generation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GenerationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generation Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GenerationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenerationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generation Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GenerationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenerationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generation Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GenerationMode get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case SOURCE_VALUE: return SOURCE;
			case CONTENTS_VALUE: return CONTENTS;
			case CONCATENATE_VALUE: return CONCATENATE;
			case MERGE_VALUE: return MERGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GenerationMode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GenerationMode
