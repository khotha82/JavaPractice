package com.example.freemarker;

/**
 * Created by krishna_hotha on 5/19/15 2015.
 */
public class ValueExampleObject {

	private String name;

	private String developer;

	public ValueExampleObject(String name, String developer) {
		this.name = name;
		this.developer = developer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}
}
