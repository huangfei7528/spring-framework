package org.springframework.beans.factory.xml.beanTest;

import org.apache.catalina.core.ApplicationContext;

/**
 * 功能描述 TODO
 *
 * @author huangfei
 */
public abstract class DisplayCar {

	public void display(){
		getCar().display();
	}

	public abstract Car getCar();




}
