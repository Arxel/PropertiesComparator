package com.cohesiva.apps.propertiescomparator.main;

import java.util.List;

public class DataOutput {

	public void displayDataOnScreen(List<Data> dataForOutPut) {
		for (int i = 0; i < dataForOutPut.size(); i++) {
			System.out.println(dataForOutPut.get(i).toString());
		}

	}

}
