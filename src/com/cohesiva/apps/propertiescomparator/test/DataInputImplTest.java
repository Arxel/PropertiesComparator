package com.cohesiva.apps.propertiescomparator.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.cohesiva.apps.propertiescomparator.main.DataInputImpl;
import com.sun.istack.internal.NotNull;

public class DataInputImplTest {
	private static final String[] TABLE = { "Siema" };
	DataInputImpl dii = new DataInputImpl();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void setUpTest() throws Exception {
		dii.setUp("file");
	}

	@Test
	public void loadTest() throws Exception {
		List<String> expected = Arrays.asList("siema");
		try {
			dii.setUp("file");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(expected, dii.load());
	}
}
