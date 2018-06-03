package com.task;

import java.util.Hashtable;
import java.util.ArrayList;

public class FamilyTree {
    //hash table is used to mapping the string name and object
    private Hashtable<String, Person> familyHashTable = new Hashtable<String, Person>(); 

    public FamilyTree(){        
        initializeTree();
    } 

    /**
     * This function is used to initilize the family tree
     */
    private void initializeTree(){
        //TBD: initial the persons and relations. 
        // Could be imporved in the future by reading config or generate seed file
        Person kingShan = new Person("King Shan", Gender.MALE);
        Person queenAnga = new Person("Queen Anga", Gender.FEMALE);
        Person ish = new Person("Ish", Gender.MALE);
        Person chit = new Person("Chit", Gender.MALE);
        Person ambi = new Person("Ambi", Gender.FEMALE);
        Person vich = new Person("Vich", Gender.MALE);
        Person lika = new Person("Lika", Gender.FEMALE);
        Person saty = new Person("Saty", Gender.FEMALE);
        Person vya = new Person("Vya", Gender.MALE);
        Person drita = new Person("Drita", Gender.MALE);
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
        drita.setSpouse(jaya);
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

        chit.setChildren(drita);
        chit.setChildren(vrita);

        vich.setChildren(vila);
        vich.setChildren(chika);

        saty.setChildren(satvy);
        saty.setChildren(savya);
        saty.setChildren(saayan);

        vila.setChildren(lavnya);

        drita.setChildren(jata);
        drita.setChildren(driya);

        familyHashTable.put("King Shan", kingShan);
        familyHashTable.put("Queen Anga", queenAnga);
        familyHashTable.put("Ish", ish);
        familyHashTable.put("Chit", chit);
        familyHashTable.put("Ambi", ambi);
        familyHashTable.put("Vich", vich);
        familyHashTable.put("Lika", lika);
        familyHashTable.put("Saty", saty);
        familyHashTable.put("Vya", vya);
        familyHashTable.put("Drita", drita);
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


    /**
     * This function is used search the relatives
     *
     * @param personName the input target person
     * @param relation the input relationship name
     * 
     * @return ArrayList that contain the relatives object
     */
    public ArrayList<String> serachRelatives(String personName, String relation) {
        //find out the person first
        Person targetPerson = familyHashTable.get(personName);          
        ArrayList<Person> resultPersons = new ArrayList<Person>();
        // the if the person existed
        if(targetPerson != null){
            resultPersons = RelationshipMapper.mapRelations(targetPerson, relation);
        }else{
            System.out.print("Input Person not existed");
        }
        return RelationshipMapper.getNameFromPerson(resultPersons);
    }
}