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
		boolean exist;
		for (int i = 0; i < patternListOfDatas.size(); i++) {
			exist = false;
			for (int j = 0; j < toCompareListOfDatas.size(); j++) {
				if (equals(patternListOfDatas.get(i),
						toCompareListOfDatas.get(j))) {
					exist = true;
				}
				// to nie mozesz robic equals bo to sa rozne obiekty !
				// tylko maja takie same dane w œrodku....
			}
			if (!exist) {
				finalOutputListWithDatas.add(patternListOfDatas.get(i));
			}
		}

		return finalOutputListWithDatas;

	}

	public boolean equals(Data o1, Data o2) {

		if (o1.firstField.compareTo(o2.firstField) > 0) {
			return false;
		} else if (o1.firstField.compareTo(o2.firstField) < 0) {
			return false;
		} else if (o1.firstField.compareTo(o2.firstField) == 0) {
			if (o1.secondField.compareTo(o2.secondField) > 0)
				return false;
			else if (o1.secondField.compareTo(o2.secondField) < 0)
				return false;
			else if (o1.secondField.compareTo(o2.secondField) == 0) {
				if (o1.thirdField.compareTo(o2.thirdField) > 0)
					return false;
				else if (o1.thirdField.compareTo(o2.thirdField) < 0)
					return false;
				else if (o1.thirdField.compareTo(o2.thirdField) == 0) {
					if (o1.thirdField.compareTo(o2.fourthField) > 0)
						return false;
					else if (o1.thirdField.compareTo(o2.fourthField) < 0)
						return false;
					else if (o1.thirdField.compareTo(o2.fourthField) == 0)
						return true;
				}
			}
		}
		return false;

	}

}
