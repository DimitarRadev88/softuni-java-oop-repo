package com.interfacesAndAbstraciton.lab.sayHelloExtended.person;

public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(String name) {
        setName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
