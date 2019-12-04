package org.springframework.beans.factory.xml.beanTest;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 功能描述 TODO
 *
 * @author huangfei
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserDefinitionParser());
	}
}
