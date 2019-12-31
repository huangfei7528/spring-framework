package org.springframework.beans.factory.xml.beanTest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能描述 TODO
 *
 * @author huangfei
 */
public class BinLi implements Car {

	@Autowired
	private Bmw bmw;

	@Override
	public void display() {
		bmw.display();
		System.out.println("binli");
	}

	public void setBmw(Bmw bmw) {
		this.bmw = bmw;
	}
}
