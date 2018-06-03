package family;

import java.util.ArrayList;

public class RelationshipMapper {
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

    public static ArrayList<String> getNameFromPerson(ArrayList<Person> persons){
        ArrayList<String> nameList = new ArrayList<String>();
        for(Person person : persons){
            nameList.add(person.name);
        }
        return nameList;
    }
}