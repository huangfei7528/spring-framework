package org.springframework.beans.factory.xml.beanTest;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * 功能描述 TODO
 *
 * @author huangfei
 */
public class MethodReplace implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("我是替换方法");
		return null;
	}
}
