package com.cohesiva.apps.propertiescomparator.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateDataFromString {

	public List<Data> createListOfData(List<String> data) {
		// data = new ArrayList<String>();
		List<Data> separetedData = new ArrayList<Data>();
		Iterator<String> iterator = data.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			if (!temp.equals("")) {
				separetedData.add(createDataFromString(temp));
			}
		}
		return separetedData;
	}

	private Data createDataFromString(String stringData) {
		String[] temp = stringData.split("=");
		String[] tableOfStrings = temp[0].split("\\.");
		Data data = null;
		if (tableOfStrings.length == 3) {
			data = new Data(tableOfStrings[0], tableOfStrings[1],
					tableOfStrings[2], "");
		} else if (tableOfStrings.length == 2) {
			data = new Data(tableOfStrings[0], tableOfStrings[1], "", "");
		} else if (tableOfStrings.length == 4) {
			data = new Data(tableOfStrings[0], tableOfStrings[1],
					tableOfStrings[2], tableOfStrings[3]);
		}
		return data;
	}
}
