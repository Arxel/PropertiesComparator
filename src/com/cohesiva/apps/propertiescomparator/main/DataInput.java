package com.cohesiva.apps.propertiescomparator.main;

import java.util.List;

public interface DataInput {
	void setUp(String fileName) throws Exception;

	List<String> load() throws Exception;
}
