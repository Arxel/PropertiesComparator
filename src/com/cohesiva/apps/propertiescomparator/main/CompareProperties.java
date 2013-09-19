package com.cohesiva.apps.propertiescomparator.main;

import java.util.ArrayList;
import java.util.List;

public class CompareProperties {

	private List<Data> finalOutputListWithDatas = new ArrayList<Data>();

	public CompareProperties() {
		// TODO Auto-generated constructor stub
	}

	public List<Data> matchProperties(List<Data> patternListOfDatas,
			List<Data> toCompareListOfDatas) {
		for (int i = 0; i < patternListOfDatas.size(); i++) {
			for (int j = 0; j < toCompareListOfDatas.size(); j++) {
				if (patternListOfDatas.get(i).equals(
						toCompareListOfDatas.get(j))) {
					break;
				} else
					finalOutputListWithDatas.add(patternListOfDatas.get(i));
			}
		}

		return finalOutputListWithDatas;

	}

}
