package org.springframework.nero.resource;

import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ResourceDef {





	@Test
	public void testResource(){
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("bean.xml");
		System.out.println(resource.exists());

	}



}
