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

            default:
                //throw error: no relations match 
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