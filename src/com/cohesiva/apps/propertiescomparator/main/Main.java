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
			referenceSeparetedData = CreateDataFromString.createListOfData(dii.loadDataToList("messages"));
			otherSeparetedData = CreateDataFromString.createListOfData(dii.loadDataToList("messages_en_US"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Sort sort = new Sort();
		sort.SortData(referenceSeparetedData);
		sort.SortData(otherSeparetedData);
		
		List<Data> finalOutputListWithDatas = new ArrayList<Data>();
		
		CompareProperties cP = new CompareProperties();
		finalOutputListWithDatas = cP.matchProperties(referenceSeparetedData, otherSeparetedData);
		
		DataOutput dO = new DataOutput();
		dO.displayDataOnScreen(finalOutputListWithDatas);
		
	}

}
