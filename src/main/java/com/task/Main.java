package com.task;

import java.util.*;

public class Main {
    public static void main(String args[]){
        // initial data structer
        FamilyTree familyTree = new FamilyTree();

        // get the user input
        Scanner in = new Scanner(System.in);          
        System.out.print("Person = "); 
        String personName = in.nextLine();
        System.out.print("Relation = ");
        String relationship = in.nextLine();   
             
        // Apply logic and print output
        try{
            ArrayList<String> resultName = familyTree.serachRelatives(personName, relationship);
            System.out.print("The " + relationship + " of " + personName + " is: ");
            printName(resultName);
        } catch(Error e){
            System.out.println("ERROR: " + e.getMessage());
        }      
    }

    /**
     * This function is used to print the name out
     *
     * @param personName the arraylist of name
     */
    public static void printName(ArrayList<String> nameList){
        if(nameList.isEmpty()){
            System.out.println("No such a Person!");
        }else {            
            for(String name : nameList){
                System.out.print(name + " ");
            }
        }
        System.out.println();
    }
}