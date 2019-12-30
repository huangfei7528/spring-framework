package org.springframework.beans.factory.xml.beanTest;

/**
 * 功能描述 TODO
 *
 * @author huangfei
 */
public class Hongqi implements Car {
	@Override
	public void display() {
		System.out.println("我是 hongqi");
	}

	public Hongqi(){

	}

	public Hongqi(String key){
		System.out.println(key);
	}

	//静态方法
	public static Car createStaticCar(String key){
		Hongqi car = new Hongqi(key);
		return car;
	}

}
