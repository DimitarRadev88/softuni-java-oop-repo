package com.solid.lab.interfaceSegragation.identity.interfaces;

public interface Account {

    void register(String username, String password);

    void login(String username, String password);

    void changePassword(String oldPass, String newPass);

    String getPasswordHash();

}
