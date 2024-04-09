/**
 */
package org.nasdanika.models.source.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.models.source.GenerationMode;
import org.nasdanika.models.source.Position;
import org.nasdanika.models.source.Range;
import org.nasdanika.models.source.Source;
import org.nasdanika.models.source.SourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.source.impl.SourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.source.impl.SourceImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.source.impl.SourceImpl#getIndent <em>Indent</em>}</li>
 *   <li>{@link org.nasdanika.models.source.impl.SourceImpl#isInterpolate <em>Interpolate</em>}</li>
 *   <li>{@link org.nasdanika.models.source.impl.SourceImpl#getGenerationMode <em>Generation Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends RangeImpl implements Source {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIndent() <em>Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndent()
	 * @generated
	 * @ordered
	 */
	protected static final String INDENT_EDEFAULT = "    ";

	/**
	 * The default value of the '{@link #isInterpolate() <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterpolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERPOLATE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getGenerationMode() <em>Generation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationMode()
	 * @generated
	 * @ordered
	 */
	protected static final GenerationMode GENERATION_MODE_EDEFAULT = GenerationMode.MERGE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(SourcePackage.SOURCE__SOURCE, SourcePackage.Literals.SOURCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(SourcePackage.SOURCE__SOURCE, SourcePackage.Literals.SOURCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Source> getChildren() {
		return (EList<Source>)eDynamicGet(SourcePackage.SOURCE__CHILDREN, SourcePackage.Literals.SOURCE__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndent() {
		return (String)eDynamicGet(SourcePackage.SOURCE__INDENT, SourcePackage.Literals.SOURCE__INDENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndent(String newIndent) {
		eDynamicSet(SourcePackage.SOURCE__INDENT, SourcePackage.Literals.SOURCE__INDENT, newIndent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterpolate() {
		return (Boolean)eDynamicGet(SourcePackage.SOURCE__INTERPOLATE, SourcePackage.Literals.SOURCE__INTERPOLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolate(boolean newInterpolate) {
		eDynamicSet(SourcePackage.SOURCE__INTERPOLATE, SourcePackage.Literals.SOURCE__INTERPOLATE, newInterpolate);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationMode getGenerationMode() {
		return (GenerationMode)eDynamicGet(SourcePackage.SOURCE__GENERATION_MODE, SourcePackage.Literals.SOURCE__GENERATION_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerationMode(GenerationMode newGenerationMode) {
		eDynamicSet(SourcePackage.SOURCE__GENERATION_MODE, SourcePackage.Literals.SOURCE__GENERATION_MODE, newGenerationMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generate(Function<String, String> tokenSource, int indent) {
		String source = getSource();
		if (this.isInterpolate()) {
			source = Util.interpolate(source, tokenSource);;
		}
		switch (getGenerationMode()) {
		case NONE: 
			return null;
		case CONCATENATE: {
			return generateContents(tokenSource, indent)
					.stream()
					.filter(Objects::nonNull)
					.filter(s -> !Util.isBlank(s.getSource()))
					.map(Source::getSource)
					.reduce(Util.isBlank(source) ? "" : source , (a,b) -> a + b);
		}
		case CONTENTS: {
			return generateContents(tokenSource, indent)
					.stream()
					.filter(Objects::nonNull)
					.filter(s -> !Util.isBlank(s.getSource()))
					.map(Source::getSource)
					.reduce("", (a,b) -> a + b);
		}
		case SOURCE: {
			return Util.isBlank(source) ? "" : source;
		}
		case MERGE: {
			if (Util.isBlank(source)) {
				// Nothing to merge - return contents;
				return generateContents(tokenSource, indent)
						.stream()
						.filter(Objects::nonNull)
						.filter(s -> !Util.isBlank(s.getSource()))
						.map(Source::getSource)
						.reduce("", (a,b) -> a + b);
			}
			List<Source> contents = generateContents(tokenSource, indent);
			if (contents.isEmpty()) {
				// Nothing to merge - return source
				return Util.isBlank(source) ? "" : source;				
			}
			
//			String[] lines = source.split("\\R");
//			
//			StringBuilder output = new StringBuilder();
//			Position position = null;
//			for (Source contentsElement: contents) {
//				Position begin = contentsElement.getBegin();
//				output.append(rangeText(position, begin, lines));
//				if (begin != null) {
//					position = decrement(begin, l -> lines[l].length());
//				}
//				output.append(contentsElement.getSource());
//				Position end = contentsElement.getEnd();
//				if (end != null) {
//					position = end;
//				}
//			}
//			output.append(rangeText(position, null, lines));
//			return output.toString();
			throw new UnsupportedOperationException("Merge is not yet implemented");
		}
		default:
			throw new UnsupportedOperationException("Unsupported generation mode: " + getGenerationMode());		
		}		
	}
	
	/**
	 * Creates a string builder with a specified number of indent tabs.
	 * @param indent
	 * @return
	 */
	protected StringBuilder indent(int indent) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < indent; ++i) {
			ret.append(getIndent());
		}
		return ret;
	}
	
//	private static Position decrement(Position position, Function<Integer, Integer> lineLengthProvider) {
//		Position ret = EcoreUtil.copy(position);
//		int column = ret.getColumn();
//		int line = ret.getLine();
//		if (column > 1) {
//			ret.setColumn(column - 1);
//		} else if (line > 1) {			
//			ret.setColumn(lineLengthProvider.apply(line - 1));
//			ret.setLine(line - 1);
//		}
//		return ret;
//	}
	
//	protected Position offset(Position position) {
//		Position begin = getBegin();
//		if (begin == null || (begin.getLine() == 1 && begin.getColumn() == 1)) {
//			return position;
//		}
//		if (position == null) {
//			return EcoreUtil.copy(begin);
//		}
//		
//		Position ret = EcoreUtil.copy(position);
//		ret.setLine(ret.getLine() - begin.getLine() + 1);
//		if (ret.getLine() == 1) {
//			ret.setColumn(ret.getColumn() - begin.getColumn() + 1);
//		}
//		return ret;
//	}
	
//	/**
//	 * 
//	 * @param start If null, then from the beginning. Exclusive.
//	 * @param end If null, then to the end. Exclusive.
//	 * @param lines
//	 * @return
//	 */
//	protected String rangeText(Position start, Position end, String[] lines) {
//		Position offsetStart = offset(start);
//		Position offsetEnd = offset(end);
//		
//		int startLine = offsetStart == null ? 1 : offsetStart.getLine();
//		StringBuilder ret = new StringBuilder();
//		int lastLine = offsetEnd == null ? lines.length : offsetEnd.getLine();
//		for (int line = startLine; line <= lastLine; ++line) {
//			String lineStr = lines[line - 1];
//			if (line == startLine && line == lastLine) {
//				int startColumn = offsetStart == null ? 1 : offsetStart.getColumn();
//				int endColumn = offsetEnd == null ? lineStr.length() : Math.min(lineStr.length(), offsetEnd.getColumn());
//				if (startColumn < endColumn) {
//					ret.append(lineStr.substring(startColumn, endColumn - 1)); // Both exclusive
//				}
//			} else if (line == startLine) {
//				int startColumn = offsetStart == null ? 1 : offsetStart.getColumn();
//				if (startColumn < lineStr.length()) {
//					ret.append(lineStr.substring(startColumn));
//				}
//			} else if (line == lastLine) {
//				int endColumn = offsetEnd == null ? lineStr.length() : offsetEnd.getColumn();
//				ret.append(lineStr.substring(0, endColumn - 1)); 				
//			} else {
//				ret.append(lineStr);
//			}
//		}
//		return ret.toString();
//	}
	
	/**
	 * For range sorting if needed
	 * @param a
	 * @param b
	 * @return
	 */
	protected static int compareRanges(Range a, Range b) {
		Position aBegin = a.getBegin();
		Position bBegin = a.getBegin();
		
		if (a.overlaps(b)) {
			throw new IllegalArgumentException("Overlapping ranges");
		}
		
		if (aBegin == null) {
			if (bBegin != null) {
				return 1;
			}
			return a.hashCode() - b.hashCode();
		} 
		
		if (bBegin == null) {
			return -1;
		}
		
		return aBegin.compareTo(bBegin);
	}
	
	/**
	 * Generates a list of sources from contents.
	 * When merging, source ranges are used to replace fragments in the original source.
	 * @param importManager
	 * @return
	 */
	protected List<Source> generateContents(Function<String, String> tokenSource, int indent) {
		List<Source> contents = new ArrayList<>();
		for (Source child: getChildren()) {
			String childGeneratedSource = child.generate(tokenSource, indent);
			if (childGeneratedSource != null) { // Blank string may be significant, so checking for null, not blank
				Source generated = Source.create(childGeneratedSource, child);
				contents.add(generated);
			}
		}		

		return contents;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SourcePackage.SOURCE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case SourcePackage.SOURCE__SOURCE:
				return getSource();
			case SourcePackage.SOURCE__CHILDREN:
				return getChildren();
			case SourcePackage.SOURCE__INDENT:
				return getIndent();
			case SourcePackage.SOURCE__INTERPOLATE:
				return isInterpolate();
			case SourcePackage.SOURCE__GENERATION_MODE:
				return getGenerationMode();
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
			case SourcePackage.SOURCE__SOURCE:
				setSource((String)newValue);
				return;
			case SourcePackage.SOURCE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Source>)newValue);
				return;
			case SourcePackage.SOURCE__INDENT:
				setIndent((String)newValue);
				return;
			case SourcePackage.SOURCE__INTERPOLATE:
				setInterpolate((Boolean)newValue);
				return;
			case SourcePackage.SOURCE__GENERATION_MODE:
				setGenerationMode((GenerationMode)newValue);
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
			case SourcePackage.SOURCE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case SourcePackage.SOURCE__CHILDREN:
				getChildren().clear();
				return;
			case SourcePackage.SOURCE__INDENT:
				setIndent(INDENT_EDEFAULT);
				return;
			case SourcePackage.SOURCE__INTERPOLATE:
				setInterpolate(INTERPOLATE_EDEFAULT);
				return;
			case SourcePackage.SOURCE__GENERATION_MODE:
				setGenerationMode(GENERATION_MODE_EDEFAULT);
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
			case SourcePackage.SOURCE__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case SourcePackage.SOURCE__CHILDREN:
				return !getChildren().isEmpty();
			case SourcePackage.SOURCE__INDENT:
				return INDENT_EDEFAULT == null ? getIndent() != null : !INDENT_EDEFAULT.equals(getIndent());
			case SourcePackage.SOURCE__INTERPOLATE:
				return isInterpolate() != INTERPOLATE_EDEFAULT;
			case SourcePackage.SOURCE__GENERATION_MODE:
				return getGenerationMode() != GENERATION_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SourcePackage.SOURCE___GENERATE__FUNCTION_INT:
				return generate((Function<String, String>)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	protected boolean isMerging() {
		return getGenerationMode() == GenerationMode.MERGE && !Util.isBlank(getSource());
	}	

} //SourceImpl
