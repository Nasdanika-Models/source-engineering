/**
 */
package org.nasdanika.models.source;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.source.Source#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.source.Source#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.source.Source#getIndent <em>Indent</em>}</li>
 *   <li>{@link org.nasdanika.models.source.Source#isInterpolate <em>Interpolate</em>}</li>
 *   <li>{@link org.nasdanika.models.source.Source#getGenerationMode <em>Generation Mode</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.source.SourcePackage#getSource()
 * @model
 * @generated
 */
public interface Source extends Range {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.source.SourcePackage#getSource_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.source.Source#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.source.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.source.SourcePackage#getSource_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getChildren();

	/**
	 * Returns the value of the '<em><b>Indent</b></em>' attribute.
	 * The default value is <code>"    "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indent</em>' attribute.
	 * @see #setIndent(String)
	 * @see org.nasdanika.models.source.SourcePackage#getSource_Indent()
	 * @model default="    "
	 * @generated
	 */
	String getIndent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.source.Source#getIndent <em>Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indent</em>' attribute.
	 * @see #getIndent()
	 * @generated
	 */
	void setIndent(String value);

	/**
	 * Returns the value of the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolate</em>' attribute.
	 * @see #setInterpolate(boolean)
	 * @see org.nasdanika.models.source.SourcePackage#getSource_Interpolate()
	 * @model
	 * @generated
	 */
	boolean isInterpolate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.source.Source#isInterpolate <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolate</em>' attribute.
	 * @see #isInterpolate()
	 * @generated
	 */
	void setInterpolate(boolean value);

	/**
	 * Returns the value of the '<em><b>Generation Mode</b></em>' attribute.
	 * The default value is <code>"MERGE"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.source.GenerationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Mode</em>' attribute.
	 * @see org.nasdanika.models.source.GenerationMode
	 * @see #setGenerationMode(GenerationMode)
	 * @see org.nasdanika.models.source.SourcePackage#getSource_GenerationMode()
	 * @model default="MERGE"
	 * @generated
	 */
	GenerationMode getGenerationMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.source.Source#getGenerationMode <em>Generation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Mode</em>' attribute.
	 * @see org.nasdanika.models.source.GenerationMode
	 * @see #getGenerationMode()
	 * @generated
	 */
	void setGenerationMode(GenerationMode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generates source code
	 * <!-- end-model-doc -->
	 * @model tokenSourceType="org.nasdanika.models.source.TokenSource"
	 * @generated
	 */
	String generate(Function<String, String> tokenSource, int indent);
	
	static Source create(CharSequence source) {
		Source ret = SourceFactory.eINSTANCE.createSource();
		ret.setSource(source.toString());
		return ret;
	}
	
	static Source create(CharSequence source, Range range) {		
		Source ret = create(source);
		if (range != null) {
			ret.setBegin(EcoreUtil.copy(range.getBegin()));
			ret.setEnd(EcoreUtil.copy(range.getEnd()));
		}
		return ret;
	}

} // Source
