package org.nasdanika.models.java.tests;

import org.junit.jupiter.api.Test;
import org.nasdanika.models.source.Source;
import org.nasdanika.models.source.SourceFactory;

public class GenerationTests {
	
	@Test
	public void testGeneration() {
		SourceFactory factory = SourceFactory.eINSTANCE;
		
		Source aTag = factory.createSource();
		aTag.getChildren().add(Source.create("<a href='...'>"));
		
		Source linkText = Source.create("Link text");
		linkText.setIndentFactor(1);
		aTag.getChildren().add(linkText);
		
		aTag.getChildren().add(Source.create("</a>"));
		
		System.out.println(aTag.generate(null, 0));
		System.out.println(aTag.generate(null, 1));

		System.out.println("*" + linkText.generate(null, 0) + "*");
	}	

}
