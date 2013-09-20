package com.cohesiva.apps.propertiescomparator.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Data> referenceSeparetedData = new ArrayList<Data>();
		List<Data> otherSeparetedData = new ArrayList<Data>();
		DataInputImpl dii = new DataInputImpl();
		CreateDataFromString sdfs = new CreateDataFromString();
		String referenceFileName = "messages";
		String otherFileName = "messages_en_US";
		analyseData(referenceSeparetedData, otherSeparetedData, dii, sdfs,
				referenceFileName, otherFileName);

	}

	private static void analyseData(List<Data> referenceSeparetedData,
			List<Data> otherSeparetedData, DataInputImpl dii,
			CreateDataFromString sdfs, String referenceFileName,
			String otherFileName) {
		try {
			List<String> list = dii.loadDataToList(referenceFileName);
			referenceSeparetedData = sdfs.createListOfData(list);
			otherSeparetedData = sdfs.createListOfData(dii
					.loadDataToList(otherFileName));

		} catch (Exception e) {
			e.printStackTrace();
		}

		Sort sort = new Sort();
		sort.SortData(referenceSeparetedData);
		sort.SortData(otherSeparetedData);

		List<Data> finalOutputListWithDatas = new ArrayList<Data>();

		CompareProperties cP = new CompareProperties();
		finalOutputListWithDatas = cP.matchProperties(referenceSeparetedData,
				otherSeparetedData);

		DataOutput dO = new DataOutput();
		dO.displayDataOnScreen(finalOutputListWithDatas);
	}

}
