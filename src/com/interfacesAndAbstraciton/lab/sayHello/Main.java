package com.interfacesAndAbstraciton.lab.sayHello;

import com.interfacesAndAbstraciton.lab.sayHello.person.Bulgarian;
import com.interfacesAndAbstraciton.lab.sayHello.person.Chinese;
import com.interfacesAndAbstraciton.lab.sayHello.person.European;
import com.interfacesAndAbstraciton.lab.sayHello.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();


        persons.add(new Bulgarian("Peter"));
        persons.add(new European("Peter"));
        persons.add(new Chinese("Peter"));

        for (Person person : persons) {
            print(person);
        }
    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }

}
