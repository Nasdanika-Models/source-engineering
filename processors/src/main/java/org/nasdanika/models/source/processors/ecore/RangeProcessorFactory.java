/**
 */
package org.nasdanika.models.source.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.source.SourcePackage;

@EClassifierNodeProcessorFactory(classifierID = SourcePackage.RANGE)
public class RangeProcessorFactory {
	
	protected Context context;
	
	public RangeProcessorFactory(Context context) {
		this.context = context;
	}	

	// TODO

} // Source
