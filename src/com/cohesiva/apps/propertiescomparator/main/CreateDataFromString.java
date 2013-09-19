package com.cohesiva.apps.propertiescomparator.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateDataFromString {

	public static List<Data> createListOfData(List<String> data) {
		data = new ArrayList<String>();
		List<Data> separetedData = new ArrayList<Data>();
		Iterator<String> iterator = data.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			if (!iterator.next().equals("")) {
				separetedData.add(createDataFromString(temp));
			}
		}
		return separetedData;
	}

	private static Data createDataFromString(String stringData) {
		String[] tableOfStrings = new String[3];
		String[] temp = stringData.split("=");
		tableOfStrings = temp[0].split(".");
		Data data = new Data(tableOfStrings[0], tableOfStrings[1],
				tableOfStrings[2]);
		return data;
	}
}
