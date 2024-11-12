package com.solid.lab.openClosedPrinciple.fileSystem;

public class File {
    private String name;
    private int length;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
