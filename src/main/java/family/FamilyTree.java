package family;

import java.util.*;

public class FamilyTree {
    private Hashtable<String, Person> familyHashTable = new Hashtable<String, Person>(); 

    public FamilyTree(){        
        initializeTree();
    } 

    private void initializeTree(){
        //TBD: initial the persons and relations. Could be imporve in the future by reading config or generate seed file
        Person kingShan = new Person("King Shan", Gender.MALE);
        Person queenAnga = new Person("Queen Anga", Gender.FEMALE);
        Person ish = new Person("Ish", Gender.MALE);
        Person chit = new Person("Chit", Gender.MALE);
        Person ambi = new Person("Ambi", Gender.FEMALE);
        Person vich = new Person("Vich", Gender.MALE);
        Person lika = new Person("Lika", Gender.FEMALE);
        Person saty = new Person("Saty", Gender.FEMALE);
        Person vya = new Person("Vya", Gender.MALE);
        Person dirta = new Person("Dirta", Gender.MALE);
        Person jaya = new Person("Jaya", Gender.FEMALE);
        Person vrita = new Person("Vrita", Gender.MALE);
        Person vila = new Person("Vila", Gender.MALE);
        Person jnki = new Person("Jnki", Gender.FEMALE);
        Person chika = new Person("Chika", Gender.FEMALE);
        Person kpila = new Person("Kpila", Gender.MALE);
        Person satvy = new Person("Satvy", Gender.FEMALE);
        Person asva = new Person("Asva", Gender.MALE);
        Person savya = new Person("Savya", Gender.MALE);
        Person krpi = new Person("Krpi", Gender.FEMALE);
        Person saayan = new Person("Saayan", Gender.MALE);
        Person mina = new Person("Mina", Gender.FEMALE);
        Person kriya = new Person("Kriya", Gender.MALE);
        Person misa = new Person("Misa", Gender.MALE);
        Person gru = new Person("Gru", Gender.MALE);
        Person lavnya = new Person("Lavnya", Gender.FEMALE);
        Person mnu = new Person("Mnu", Gender.MALE);
        Person driya = new Person("Driya", Gender.FEMALE);
        Person jata = new Person("Jata", Gender.MALE);

        kingShan.setSpouse(queenAnga);
        chit.setSpouse(ambi);
        vich.setSpouse(lika);
        saty.setSpouse(vya);
        dirta.setSpouse(jaya);
        vila.setSpouse(jnki);
        chika.setSpouse(kpila);
        satvy.setSpouse(asva);
        savya.setSpouse(krpi);
        saayan.setSpouse(mina);
        driya.setSpouse(mnu);
        lavnya.setSpouse(gru);

        kingShan.setChildren(chit);
        kingShan.setChildren(ish);
        kingShan.setChildren(vich);
        kingShan.setChildren(saty);

        chit.setChildren(dirta);
        chit.setChildren(vrita);

        vich.setChildren(vila);
        vich.setChildren(chika);

        saty.setChildren(satvy);
        saty.setChildren(savya);
        saty.setChildren(saayan);

        vila.setChildren(lavnya);

        dirta.setChildren(jata);
        dirta.setChildren(driya);

        familyHashTable.put("King Shan", kingShan);
        familyHashTable.put("Queen Anga", queenAnga);
        familyHashTable.put("Ish", ish);
        familyHashTable.put("Chit", chit);
        familyHashTable.put("Ambi", ambi);
        familyHashTable.put("Vich", vich);
        familyHashTable.put("Lika", lika);
        familyHashTable.put("Saty", saty);
        familyHashTable.put("Vya", vya);
        familyHashTable.put("Dirta", dirta);
        familyHashTable.put("Jaya", jaya);
        familyHashTable.put("Vrita", vrita);
        familyHashTable.put("Vila", vila);
        familyHashTable.put("Jnki", jnki);
        familyHashTable.put("Chika", chika);
        familyHashTable.put("Kpila", kpila);
        familyHashTable.put("Satvy", satvy);
        familyHashTable.put("Asva", asva);
        familyHashTable.put("Savya", savya);
        familyHashTable.put("Krpi", krpi);
        familyHashTable.put("Saayan", saayan);
        familyHashTable.put("Mina", mina);
        familyHashTable.put("Kriya", kriya);
        familyHashTable.put("Misa", misa);
        familyHashTable.put("Gru", gru);
        familyHashTable.put("Lavnya", lavnya);
        familyHashTable.put("Mnu", mnu);
        familyHashTable.put("Driya", driya);
        familyHashTable.put("Jata", jata);
    }

    public ArrayList<String> serachRelatives(String personName, String relation) {
        Person targetPerson = familyHashTable.get(personName);          
        ArrayList<Person> resultPersons = new ArrayList<Person>();
        if(targetPerson != null){
            resultPersons = RelationshipMapper.mapRelations(targetPerson, relation);
        }else{
            System.out.print("Input Person not existed");
        }
        return RelationshipMapper.getNameFromPerson(resultPersons);
    }
}