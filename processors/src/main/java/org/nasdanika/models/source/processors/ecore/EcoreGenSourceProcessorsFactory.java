package org.nasdanika.models.source.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.source.SourcePackage;

@EPackageNodeProcessorFactory(nsURI = SourcePackage.eNS_URI)
public class EcoreGenSourceProcessorsFactory {

	private Context context;
	
	@Factory
	public final SourceProcessorFactory sourceProcessorFactory;	
	
	@Factory
	public final PositionProcessorFactory positionProcessorFactory;	
	
	@Factory
	public final RangeProcessorFactory rangeProcessorFactory;	
		
	public EcoreGenSourceProcessorsFactory(Context context) {
		this.context = context;
		sourceProcessorFactory = new SourceProcessorFactory(context);
		positionProcessorFactory = new PositionProcessorFactory(context);
		rangeProcessorFactory = new RangeProcessorFactory(context);
	}
	

	@EPackageNodeProcessorFactory(
			label = "Source",
			description = "Source model for analysis and code generation",
			actionPrototype = """
            app-action:
              icon: https://img.icons8.com/color/48/document--v1.png
              content:
                content-markdown:
                  source:
                    content-resource:
                      location: source.md
			"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
