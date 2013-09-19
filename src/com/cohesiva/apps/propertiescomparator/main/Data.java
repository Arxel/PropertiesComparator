package com.cohesiva.apps.propertiescomparator.main;

public class Data {
	String firstField;
	String secondField;
	String thirdField;

	public Data(String firstField, String secondField, String thirdField) {
		super();
		this.firstField = firstField;
		this.secondField = secondField;
		this.thirdField = thirdField;
	}

	public String toString() {
		return firstField + "." + secondField + "." + thirdField;
	}

}
