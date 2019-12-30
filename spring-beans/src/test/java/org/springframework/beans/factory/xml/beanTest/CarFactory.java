package org.springframework.beans.factory.xml.beanTest;

public class CarFactory {
	//非静态方法
	public Bmw createCar(){
		Bmw car = new Bmw();
		return car;
	}

	//静态方法
	public static Car createStaticCar(){
		Hongqi car = new Hongqi();
		return car;
	}



}
