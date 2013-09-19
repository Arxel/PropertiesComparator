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
		Data data;
		if (tableOfStrings.length > 2) {
			// jezeli tableofstring[2] istnieje to dodaj 3, jak nie to null
			data = new Data(tableOfStrings[0], tableOfStrings[1],
					tableOfStrings[2]);
		} else {
			data = new Data(tableOfStrings[0], tableOfStrings[1], "");
		}
		return data;
	}
}
