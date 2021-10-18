package util;

import model.MilitaryOffice;
import model.Person;
import model.PersonRegistry;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", 15, "man", "RB, Vitebsk");
        Person person2 = new Person("Василий", 18, "man", "RB, Brest");
        Person person3 = new Person("Петр", 19, "man", "RB, Minsk");
        Person person4 = new Person("Александр", 20, "man", "RB, Gomel");
        Person person5 = new Person("Иннокентий", 21, "man", "RB, Minsk");
        Person person6 = new Person("Александр", 25, "man", "RB, Lida");
        Person person7 = new Person("Федор", 28, "man", "RB, Minsk");

        PersonRegistry personRegistry = new PersonRegistry();

        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);

        personRegistry.getListPerson().add(person1);
        personRegistry.getListPerson().add(person2);
        personRegistry.getListPerson().add(person3);
        personRegistry.getListPerson().add(person4);
        personRegistry.getListPerson().add(person5);
        personRegistry.getListPerson().add(person6);
        personRegistry.getListPerson().add(person7);

        militaryOffice.findPerson(personRegistry.getListPerson());
        militaryOffice.countingPerson(personRegistry.getListPerson());
        militaryOffice.countingPersonAge(personRegistry.getListPerson());
        militaryOffice.countingPersonName(personRegistry.getListPerson());

    }
}
