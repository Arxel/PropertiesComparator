package com.cohesiva.apps.propertiescomparator.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	private ArrayList<Data> datasList;

	public Sort(ArrayList<Data> DatasList) {
		this.datasList = DatasList;
	}

	public List<Data> SortData(Data[] objectsList) {
		importData(objectsList);
		Collections.sort(datasList, new DataComparator());
		return datasList;

	}

	protected void importData(Data[] objectsList) {
		for (int i = 0; i < objectsList.length; i++) {
			this.datasList.add(objectsList[i]);
		}
	}

	private class DataComparator implements Comparator<Data> {

		@Override
		public int compare(Data o1, Data o2) {

			if (o1.firstField.compareTo(o2.firstField) > 0) {
				return 1;
			} else if (o1.firstField.compareTo(o2.firstField) < 0) {
				return -1;
			} else if (o1.firstField.compareTo(o2.firstField) == 0) {
				if (o1.secondField.compareTo(o2.secondField) > 0)
					return 1;
				else if (o1.secondField.compareTo(o2.secondField) < 0)
					return -1;
				else if (o1.secondField.compareTo(o2.secondField) == 0) {
					if (o1.thirdField.compareTo(o2.thirdField) > 0)
						return 1;
					else if (o1.thirdField.compareTo(o2.thirdField) < 0)
						return -1;
					else if (o1.thirdField.compareTo(o2.thirdField) == 0)
						return 0;
				}
			}

			return 0;

		}

	}

}
