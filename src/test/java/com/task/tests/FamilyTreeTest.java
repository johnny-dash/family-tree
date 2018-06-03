package com.task.test;

import static org.junit.Assert.*;

import com.task.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class FamilyTreeTest {
	private FamilyTree testTree;

	@Before
	public void setUp() {
		this.testTree = new FamilyTree();	
	}

	@Test
	public void testGetFather() {				
		ArrayList<String> result = this.testTree.serachRelatives("Chit", "Father");
		assertEquals(result.size(), 1);
		assertTrue(result.contains("King Shan"));
	}

	@Test
	public void testGetMother() {
		ArrayList<String> result = this.testTree.serachRelatives("Jata", "Mother");
		assertEquals(result.size(), 1);
		assertTrue(result.contains("Jaya"));
	}

	@Test
	public void testGetChildren() {
		ArrayList<String> result = this.testTree.serachRelatives("Saty", "Children");
		assertEquals(result.size(), 3);
		assertTrue(result.contains("Satvy"));
		assertTrue(result.contains("Savya"));
		assertTrue(result.contains("Saayan"));
	}

	@Test
	public void testGetSon() {
		ArrayList<String> result = this.testTree.serachRelatives("King Shan", "Son");
		assertEquals(result.size(), 3);
		assertTrue(result.contains("Ish"));
		assertTrue(result.contains("Chit"));
		assertTrue(result.contains("Vich"));
	}

	@Test
	public void testGetDaughter() {
		ArrayList<String> result = this.testTree.serachRelatives("Lika", "Daughter");
		assertEquals(result.size(), 1);
		assertTrue(result.contains("Chika"));		
	}

	@Test
	public void testGetCousin() {
		ArrayList<String> result = this.testTree.serachRelatives("Chit", "Cousin");
		assertEquals(result.size(), 3);
		assertTrue(result.contains("Ish"));
		assertTrue(result.contains("Saty"));
		assertTrue(result.contains("Vich"));
	}

	@Test
	public void testGetBrother() {
		ArrayList<String> result = this.testTree.serachRelatives("Saayan", "Brother");
		assertEquals(result.size(), 1);
		assertTrue(result.contains("Savya"));		
	}

	@Test
	public void testGetSister() {
		ArrayList<String> result = this.testTree.serachRelatives("Satvy", "Sister");
		assertEquals(result.size(), 0);			
	}

	@Test
	public void testGetGrandSon() {
		ArrayList<String> result = this.testTree.serachRelatives("King Shan", "Grand Son");
		assertEquals(result.size(), 5);
		assertTrue(result.contains("Drita"));	
		assertTrue(result.contains("Vrita"));	
		assertTrue(result.contains("Vila"));	
		assertTrue(result.contains("Savya"));	
		assertTrue(result.contains("Saayan"));	
	}

	@Test
	public void testGetGrandDaughter() {
		ArrayList<String> result = this.testTree.serachRelatives("Lika", "Grand Daughter");
		assertEquals(result.size(), 1);
		assertTrue(result.contains("Lavnya"));	
	}

	@Test
	public void testGetPaternalUncle() {
		ArrayList<String> result = this.testTree.serachRelatives("Jata", "Paternal Uncle");
		assertEquals(result.size(), 1);
		assertTrue(result.contains("Vrita"));
	}

	@Test
	public void testGetMaternalUncle() {
		ArrayList<String> result = this.testTree.serachRelatives("Satvy", "Maternal Uncle");
		assertEquals(result.size(), 3);
		assertTrue(result.contains("Ish"));
		assertTrue(result.contains("Chit"));
		assertTrue(result.contains("Vich"));
	}

	@Test
	public void testGetPaternalAunt() {
		ArrayList<String> result = this.testTree.serachRelatives("Drita", "Paternal Aunt");
		assertEquals(result.size(), 1);
		assertTrue(result.contains("Saty"));
	}

	@Test
	public void testGetMaternalAunt() {
		ArrayList<String> result = this.testTree.serachRelatives("Savya", "Maternal Aunt");
		assertEquals(result.size(), 0);
	}

	@Test
	public void testGetBrotherInLaw() {
		ArrayList<String> result = this.testTree.serachRelatives("Ambi", "Brother In Law");
		assertEquals(result.size(), 2);
		assertTrue(result.contains("Ish"));
		assertTrue(result.contains("Vich"));
	}

	@Test
	public void testGetSisterInLaw() {
		ArrayList<String> result = this.testTree.serachRelatives("Ambi", "Sister In Law");
		assertEquals(result.size(), 1);
		assertTrue(result.contains("Saty"));		
	}

}