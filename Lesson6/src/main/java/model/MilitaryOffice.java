package model;

import java.util.ArrayList;

public class MilitaryOffice {

    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public PersonRegistry getPersonRegistry() {
        return personRegistry;
    }

    public void findPerson(ArrayList<Person> listPerson) {
        ArrayList<Person> printList = new ArrayList<>();
        for (Person person : listPerson) {
            if (person.getSex().equals("man") & person.getAge() > 17 & person.getAge() < 28) {
                printList.add(person);
            }
        }
        System.out.println("Мужчины годные к военной службе от 18 до 27 лет: " + printList.toString());
    }

    public void countingPerson(ArrayList<Person> listPerson) {
        ArrayList<Person> printList = new ArrayList<>();
        for (Person person : listPerson) {
            if (person.getSex().equals("man") & person.getAge() >= 18 & person.getAge() <= 27 & person.getAddress().equals("RB, Minsk")) {
                printList.add(person);
            }
        }
        System.out.println("Годных к воинской службе призывников в Минске от 18 до 27 лет " + printList.size());
    }

    public void countingPersonAge(ArrayList<Person> listPerson) {
        ArrayList<Person> printList = new ArrayList<>();
        for (Person person : listPerson) {
            if (person.getSex().equals("man") & person.getAge() >= 25 & person.getAge() <= 27) {
                printList.add(person);
            }
        }
        System.out.println("Призывники от 25-27 лет: " + printList.size());
    }

    public void countingPersonName(ArrayList<Person> listPerson) {
        ArrayList<Person> printList = new ArrayList<>();

        for (Person person : listPerson) {
            if ((person.getSex().equals("man")) & person.getAge() >= 18 & person.getAge() <= 27 & person.getName().equals("Александр")) {
                printList.add(person);
            }
        }
        System.out.println("Годных к воинской службе призывников с именем Александр " + printList.size());
    }
}
