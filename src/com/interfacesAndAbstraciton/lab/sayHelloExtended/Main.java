package com.interfacesAndAbstraciton.lab.sayHelloExtended;

import com.interfacesAndAbstraciton.lab.sayHelloExtended.person.Bulgarian;
import com.interfacesAndAbstraciton.lab.sayHelloExtended.person.Chinese;
import com.interfacesAndAbstraciton.lab.sayHelloExtended.person.European;
import com.interfacesAndAbstraciton.lab.sayHelloExtended.person.Person;

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
