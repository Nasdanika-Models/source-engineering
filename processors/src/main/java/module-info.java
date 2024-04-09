module org.nasdanika.models.source.processors {
		
	requires transitive org.nasdanika.models.source;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.source.processors.ecore;
	opens org.nasdanika.models.source.processors.ecore; // For loading resources
	
}
