package com.cohesiva.apps.propertiescomparator.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Data> referenceSeparetedData = new ArrayList<Data>();
		List<Data> otherSeparetedData = new ArrayList<Data>();
		DataInputImpl dii = new DataInputImpl();
	//	CreateDataFromString sdfs = new CreateDataFromString();

		try {
			referenceSeparetedData = CreateDataFromString.createListOfData(dii.loadDataToList("file"));
			otherSeparetedData = CreateDataFromString.createListOfData(dii.loadDataToList("file"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
