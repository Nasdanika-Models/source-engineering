module org.nasdanika.models.source {
	
	exports org.nasdanika.models.source;
	exports org.nasdanika.models.source.impl;
	exports org.nasdanika.models.source.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.ncore;
	requires org.eclipse.emf.ecore.xmi; 

}