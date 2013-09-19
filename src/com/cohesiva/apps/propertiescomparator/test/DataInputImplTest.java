package com.cohesiva.apps.propertiescomparator.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.cohesiva.apps.propertiescomparator.main.DataInputImpl;

public class DataInputImplTest {
	private static final String STRING_FILENAME_FILE = "file";
	private static final String STRING_SIEMA = "siema";
	DataInputImpl dii = new DataInputImpl();

	@Test
	public void setUpTest() throws Exception {
		dii.setUpFile(STRING_FILENAME_FILE);
	}

	@Test
	public void loadTest() throws Exception {
		List<String> expected = Arrays.asList(STRING_SIEMA);
		try {
			dii.setUpFile(STRING_FILENAME_FILE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(expected, dii.loadDataToList(STRING_FILENAME_FILE));
	}
}
