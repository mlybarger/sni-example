package org.test;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(Example.class)
public class ExampleBean implements Example {

	@Inject
	@Reference
	SniReference sniReference;
	
	@Override
	public String invoke(String input) {
		String response = sniReference.invoke();
		System.out.println("response:" + response);
		return response;
	}

}
