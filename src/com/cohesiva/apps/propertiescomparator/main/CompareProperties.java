package com.cohesiva.apps.propertiescomparator.main;

import java.util.ArrayList;
import java.util.List;

public class CompareProperties {

	private List<Data> patternListOfDatas = new ArrayList<Data>();
	private List<Data> toCompareListOfDatas = new ArrayList<Data>();
	private List<Data> finalOutputListWithDatas = new ArrayList<Data>();

	public CompareProperties(List<Data> patternListOfDatas,
			List<Data> toCompareListOfDatas) {
		this.patternListOfDatas = patternListOfDatas;
		this.toCompareListOfDatas = toCompareListOfDatas;
	}

	public List<Data> matchProperties() {
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
