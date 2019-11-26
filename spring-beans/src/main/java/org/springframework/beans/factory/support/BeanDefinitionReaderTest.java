package org.springframework.beans.factory.support;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * 功能描述 TODO
 *
 * @author huangfei
 */
public class BeanDefinitionReaderTest {

	public static void main(String[] args) {
		//资源定位
		ClassPathResource resource = new ClassPathResource("bean.xml"); // <1>
		//装载
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // <2>
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory); // <3>
		//注册
		reader.loadBeanDefinitions(resource); // <4>
		factory.getBean("");
	}

}
