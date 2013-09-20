package com.cohesiva.apps.propertiescomparator.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public void SortData(List<Data> objectsList) {
		Collections.sort(objectsList, new DataComparator());

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
					else if (o1.thirdField.compareTo(o2.thirdField) == 0) {
						if (o1.thirdField.compareTo(o2.fourthField) > 0)
							return 1;
						else if (o1.thirdField.compareTo(o2.fourthField) < 0)
							return -1;
						else if (o1.thirdField.compareTo(o2.fourthField) == 0)
							return 0;
					}
				}
			}

			return 0;

		}

	}

}
