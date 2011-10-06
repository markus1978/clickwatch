package de.hub.clickwatch.connection.adapter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.model.Handler;
import de.hub.emfxml.XmlModelRepository;

public class XmlValueAdapter extends AbstractValueAdapter implements IValueAdapter {
	
	@Inject private XmlModelRepository xmlModelRepository;

	@Override
	protected void setValue(Handler handler, String plainRealValue) {
		plainRealValue = XmlModelRepository.stripProcessingInstructions(plainRealValue);
		XMLTypeDocumentRoot xml = (XMLTypeDocumentRoot)xmlModelRepository.deserializeXml("<xml>" + plainRealValue + "</xml>");
		FeatureMap xmlRootMixed = ((AnyType)xml.getMixed().getValue(0)).getMixed();
		if (xmlRootMixed.size() > 0) {
			for(FeatureMap.Entry entry: xmlRootMixed) {
				Object anyValue = entry.getValue();
				if (!(anyValue == null || (anyValue instanceof String && "".equals(((String)anyValue).trim())))) {
					EStructuralFeature anyFeature = entry.getEStructuralFeature();
					FeatureMap map = anyValue instanceof String ? handler.getMixed() : handler.getAny();
					if (map.isEmpty()) {
						map.add(FeatureMapUtil.createRawEntry(anyFeature, anyValue));
					} else {
						map.set(0, FeatureMapUtil.createRawEntry(anyFeature, anyValue));
					}
					EcoreUtil.delete(xml, true);
					return;
				}
			}					
		}
	}

	@Override
	public String getPlainValue(Handler handler) {
		Object modelValue;
		FeatureMap any = handler.getAny();
		if (!any.isEmpty()) {
			modelValue = any.get(0);
		} else {
			FeatureMap mixed = handler.getMixed();
			if (mixed.isEmpty()) {
				modelValue = null;
			} else {
				modelValue = mixed.get(0);
			}
		}
		
		XMLTypeDocumentRoot xml = XMLTypeFactory.eINSTANCE.createXMLTypeDocumentRoot();
		if (modelValue == null) {
			return "";
		} if (modelValue instanceof String) {
			xml.getMixed().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), modelValue);
		} else if (modelValue instanceof FeatureMap.Entry) {
			FeatureMap.Entry fmeValue = (FeatureMap.Entry)modelValue;
			if (fmeValue.getValue() instanceof String) {
//				xml.getMixed().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), fmeValue.getValue());
				xml.getMixed().add(FeatureMapUtil.createEntry(fmeValue.getEStructuralFeature(), fmeValue.getValue()));
			} else {
				xml.getMixed().add(FeatureMapUtil.createEntry(fmeValue.getEStructuralFeature(), EcoreUtil.copy((EObject)fmeValue.getValue())));
			}
		} else {
			Preconditions.checkArgument(false);	
		}

		String xmlString = xmlModelRepository.serializeXml(xml);
		xmlString = xmlString.substring(xmlString.indexOf("?>\n") + 3);
		
		EcoreUtil.delete(xml, true);
		
		return xmlString;
	}

	@Override
	public void moveValue(Handler source, Handler target) {
		FeatureMap any = target.getAny();
		any.clear();
		any.addAll(source.getAny());
		FeatureMap mixed = target.getMixed();
		mixed.clear();
		mixed.addAll(source.getMixed());
	}

	@Override
	public boolean valuesEquals(Handler h1, Handler h2) {
		return h1.equals(h2);
	}

	@Override
	public void clearValue(Handler handler) {
		handler.getAny().clear();
		handler.getMixed().clear();
	}

}
