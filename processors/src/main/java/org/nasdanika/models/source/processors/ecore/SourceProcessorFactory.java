/**
 */
package org.nasdanika.models.source.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.source.SourcePackage;

@EClassifierNodeProcessorFactory(classifierID = SourcePackage.SOURCE)
public class SourceProcessorFactory extends RangeProcessorFactory {
		
	public SourceProcessorFactory(Context context) {
		super(context);
	}	

} // Source
