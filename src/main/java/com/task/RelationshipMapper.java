package com.task;

import java.util.ArrayList;

public class RelationshipMapper {
    /**
     * This function is used to apply the specific geter method to target person
     * by detect the relation string
     *
     * @param targe the input target person object
     * @param relation the input relationship name
     * 
     * @return ArrayList that contain the relatives object
     */
    public static ArrayList<Person> mapRelations(Person target,String relation){
        ArrayList<Person> result = new ArrayList<Person>();
        switch(relation){
            case Relationship.MOTHER:
                Person mum = target.getMother();
                result.add(mum);
                break;

            case Relationship.FATHER:
                Person father = target.getFather();
                result.add(father);
                break;

            case Relationship.SON:                                
                result = target.getSon();                
                break;

            case Relationship.DAUGHTER:
                result = target.getDaughter();
                break;            
        
            case Relationship.CHILDREN:
                result = target.getChildren();
                break;
            
            case Relationship.COUSINS:
                result = NoneDirectRelationHandler.getCousin(target);
                break;

            case Relationship.BROTHER:
                result = NoneDirectRelationHandler.getBrother(target);
                break;
            
            case Relationship.SISTER:
                result = NoneDirectRelationHandler.getSister(target);
                break;

            case Relationship.PATERNAL_UNCLE:
                result = NoneDirectRelationHandler.getPaternalUncle(target);
                break;

            case Relationship.PATERNAL_AUNT:
                result = NoneDirectRelationHandler.getPaternalAunt(target);
                break;

            case Relationship.MATERNAL_UNCLE:
                result = NoneDirectRelationHandler.getMaternalUncle(target);
                break;

            case Relationship.MATERNAL_AUNT:
                result = NoneDirectRelationHandler.getMaternalAunt(target);
                break;
            
            case Relationship.SISTER_IN_LAW:
                result = NoneDirectRelationHandler.getSisterInLaw(target);
                break;

            case Relationship.BROTHER_IN_LAW:
                result = NoneDirectRelationHandler.getBrotherInLaw(target);
                break;

            case Relationship.GRAND_DAUGHTER:
                result = NoneDirectRelationHandler.getGrandDaughter(target);
                break;

            case Relationship.GRAND_SON:
                result = NoneDirectRelationHandler.getGrandSon(target);
                break;

            default:
                //TBD: throw error: no relations match 
                break;

        }
        return result;
    }


    /**
     * This function is used to get the name of each person object
     * in person arraylist, could be rewrite in reduce method in the future.
     *
     * @param persons the arraylist of person object     
     * 
     * @return String arrayList of person name
     */
    public static ArrayList<String> getNameFromPerson(ArrayList<Person> persons){
        ArrayList<String> nameList = new ArrayList<String>();
        for(Person person : persons){
            nameList.add(person.name);
        }
        return nameList;
    }
}