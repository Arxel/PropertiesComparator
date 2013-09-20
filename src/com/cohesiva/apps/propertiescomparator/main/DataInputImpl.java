package com.cohesiva.apps.propertiescomparator.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DataInputImpl implements DataInput {
	List<String> data = new ArrayList<String>();
	BufferedReader br;

	@Override
	public void setUpFile(String fileName) throws Exception {

		try {
			br = new BufferedReader(new FileReader(fileName + ".properties"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<String> loadDataToList(String fileName) throws Exception {
		data.clear();
		setUpFile(fileName);
		try {
			String line = br.readLine();

			while (line != null) {
				data.add(line);

				line = br.readLine();
			}

			br.close();
		} catch (Exception e) {
			// e.printStackTrace();
		}

		return data;
	}
}
