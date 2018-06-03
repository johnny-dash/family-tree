package com.task.test;

import static org.junit.Assert.*;

import com.task.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


public class FamilyTreeErrorTest {
    private FamilyTree testTree;

	@Before
	public void setUp() {
		this.testTree = new FamilyTree();	
    }
    
    @Test
	public void testNoFatherError() {				
        try{
            ArrayList<String> result = this.testTree.serachRelatives("Ambi", "Father");		
        }catch(Error e){
            assertEquals(e.getMessage(), "Ambi doesn't have a father");
        }		
    }
    
    @Test
	public void testNoMotherError() {				
        try{
            ArrayList<String> result = this.testTree.serachRelatives("Lika", "Mother");		
        }catch(Error e){
            assertEquals(e.getMessage(), "Lika doesn't have a mother");
        }		
    }

    @Test
	public void testNoGrandSonError() {				
        try{
            ArrayList<String> result = this.testTree.serachRelatives("Drita", "Grand Son");		
        }catch(Error e){
            assertEquals(e.getMessage(), "Drita's children don't have any son yet");
        }		
    }
    

    @Test
	public void testNoGrandDaughterError() {				
        try{
            ArrayList<String> result = this.testTree.serachRelatives("Vya", "Grand Daughter");		
        }catch(Error e){
            assertEquals(e.getMessage(), "Drita's children don't have any daughter yet");
        }		
    }

}