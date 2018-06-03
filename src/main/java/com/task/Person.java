package com.task;

import java.util.*;


public class Person {
    public final Gender gender;
    public final String name;
    
    private Person parter;
    private ArrayList<Person> children;
    private Person father;
    private Person mother;

    public Person(String name, Gender gender){
        this.gender = gender;
        this.name = name;
        this.children = new ArrayList<Person>();
    }    

    public void setChildren(Person child){
        // Assumption: only couple could have child, only after marrige could get the child
        if(this.parter == null ){
            throw new Error(this.name 
                + " doesn't have a partner, in this system "
                + (this.gender == Gender.MALE ? "he" : "she") 
                + " can not have a child");
        }

        // need to wap in trancation
        boolean isFemale = this.gender == Gender.FEMALE ? true : false;
        child.mother = (isFemale ? this : this.parter);
        child.father = (isFemale ? this.parter : this);
        this.children.add(child);
        if(this.parter != null ){
            ArrayList<Person> parterChildren = this.parter.getChildren();
            if(!parterChildren.contains(child)){
                this.parter.setChildren(child);
            }
        }
    }

    public void setMother(Person mother){
        if(mother.gender != Gender.FEMALE) {
            throw new Error("The mother should be female");
        }
        this.mother = mother;
    }

    public void setFather(Person father){
        if(father.gender != Gender.MALE){
            throw new Error("The father should be male");
        }
        this.father = father;
    }

    public void setSpouse(Person spouse){
        // Assumption: this case only consider heterosexuality
        if(spouse.gender == this.gender){
            throw new Error("The spouse's gender should be " + (this.gender == Gender.MALE ? "female" : "male"));
        }
        this.parter = spouse;

        if(spouse.getSpouse() == null){            
            // need to inprove
            spouse.setSpouse(this);        
        }
        
    }

    public ArrayList<Person> getChildren() {
        return this.children;
    }

    public ArrayList<Person> getSon() {
        ArrayList<Person> sons = new ArrayList<Person>();
        for(Person child : this.children){
            if(child.gender == Gender.MALE){
                sons.add(child);
            }
        }
        return sons;
    }

    public ArrayList<Person> getDaughter() {
        ArrayList<Person> daughters = new ArrayList<Person>();
        for(Person child : this.children){
            if(child.gender == Gender.FEMALE){
                daughters.add(child);
            }
        }
        return daughters;
    }

    public Person getFather() {
        if(this.father == null) throw new Error(this.name + " doesn't have a father");
        return this.father;
    }

    public Person getMother() {
        if(this.mother == null) throw new Error(this.name + " doesn't have a mother");
        return this.mother;
    }

    public Person getSpouse() {        
        return parter;
    }

}