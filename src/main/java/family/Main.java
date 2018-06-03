package family;

import java.util.*;

public class Main {
    public static void main(String args[]){
        // initial data structer
        Scanner in = new Scanner(System.in);  
        FamilyTree familyTree = new FamilyTree();
        
        System.out.print("Person = "); 
        String personName = in.nextLine();
        System.out.print("Relation = ");
        String relationship = in.nextLine();        
        ArrayList<String> resultName = familyTree.serachRelatives(personName, relationship);
        System.out.print("The " + relationship + " of " + personName + " is: ");
        printName(resultName);
    }

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