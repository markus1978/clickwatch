package de.hub.specificmodels.metamodelgenerator.targetidprovider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator.TargetId;

public class FeatureMapEntryTargetIdProvider extends AbstractTargetIdProvider {

	public FeatureMapEntryTargetIdProvider() {
		super();
	}

	public FeatureMapEntryTargetIdProvider(boolean addToCopyParentsOnly) {
		super(addToCopyParentsOnly);
	}

	@Override
	protected TargetId createTargetId(TargetId parentId, SourceObjectKey sok) {
		if (sok.getFeature() instanceof EReference) {
			return new TargetId(parentId, sok.getFeature(), (EClass)sok.getFeature().getEType(), 
					firstToLower(sok.getFeature().getName()), firstToUpper(sok.getFeature().getName()));	
		} else {
			return new TargetId(parentId, sok.getFeature(), null, 
					firstToLower(sok.getFeature().getName()), null);
		}
		
	}

}
