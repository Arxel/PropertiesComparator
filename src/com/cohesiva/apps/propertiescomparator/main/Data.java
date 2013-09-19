package com.cohesiva.apps.propertiescomparator.main;

public class Data {
	String firstField;
	String secondField;
	String thirdField;
	String fourthField;

	public Data(String firstField, String secondField, String thirdField,
			String fourthField) {
		super();
		this.firstField = firstField;
		this.secondField = secondField;
		this.thirdField = thirdField;
		this.fourthField = fourthField;
	}

	public String toString() {
		return firstField + "." + secondField + "." + thirdField + "."
				+ fourthField; //TODO: if exist !!
	}

}
