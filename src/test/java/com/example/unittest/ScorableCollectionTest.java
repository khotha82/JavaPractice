package com.example.unittest;

import static org.junit.Assert.*;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by krishna_hotha on 4/15/15.
 */
public class ScorableCollectionTest extends TestCase {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testGetAverage() throws Exception {

		ScorableCollection scorableCollection = new ScorableCollection();
		scorableCollection.add(() -> 5);
		scorableCollection.add(() -> 7);

		int average = scorableCollection.getAverage();
		assertEquals(6, average);
	}
}