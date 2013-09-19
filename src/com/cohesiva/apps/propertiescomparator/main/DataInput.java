package com.cohesiva.apps.propertiescomparator.main;

import java.util.List;

public interface DataInput {
	void setUpFile(String fileName) throws Exception;

	List<String> loadDataToList(String fileName) throws Exception;
}
