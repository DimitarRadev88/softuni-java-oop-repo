package com.interfacesAndAbstraciton.lab.sayHelloExtended.person;

public class European extends BasePerson {

    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }

}
