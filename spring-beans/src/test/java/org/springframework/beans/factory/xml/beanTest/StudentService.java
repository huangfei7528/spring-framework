package org.springframework.beans.factory.xml.beanTest;

/**
 *
 * @author huangfei
 */
public class StudentService {
	private String name;

	private Integer age;

	private MethodReplace replace;

	StudentService(String name, Integer age, MethodReplace replace){

		this.name = name;

		this.age = age;

		this.replace = replace;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public MethodReplace getReplace() {
		return replace;
	}

	public void setReplace(MethodReplace replace) {
		this.replace = replace;
	}
}
