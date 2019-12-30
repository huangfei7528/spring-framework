package org.springframework.beans.factory.xml.beanTest;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.beanTest.DisplayCar;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author huangfei
 */
public class BeanTests {

	@Test
	public void lookupMethod() {
		ClassPathResource resource = new ClassPathResource("bean-test.xml", this.getClass());
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		DisplayCar display = (DisplayCar) factory.getBean("display");
		display.display();
	}

	@Test
	public void testCar(){
		ClassPathResource resource = new ClassPathResource("bean-test.xml", this.getClass());
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		Bmw bmw = (Bmw) factory.getBean("bmw");
		bmw.display();
	}

	@Test
	public void testStatisCar(){
		ClassPathResource resource = new ClassPathResource("bean-test.xml", this.getClass());
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		Hongqi bmw = (Hongqi) factory.getBean("hongqi");
		bmw.display();
	}
	@Test
	public void replacedMethod() {
		ClassPathResource resource = new ClassPathResource("bean-test.xml", this.getClass());
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		Method  method = (Method ) factory.getBean("method");
		method.display();
	}

	@Test
	public void constructorArg() {
		ClassPathResource resource = new ClassPathResource("bean-test.xml", this.getClass());
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		StudentService  method = (StudentService ) factory.getBean("studentService");
		System.out.println(method.getName() + ":" + method.getAge());
	}

	@Test
	public void customerBean() {
		ClassPathResource resource = new ClassPathResource("bean-test.xml", this.getClass());
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		User user = (User) factory.getBean("user ");
		System.out.println(user.getId()  + ":" + user.getUserName() + ":" + user.getEmail());
	}


}
