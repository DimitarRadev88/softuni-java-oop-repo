package com.solid.lab.interfaceSegragation.identity.interfaces;

public interface UserRepository {

    Iterable<User> getAllUsersOnline();

    Iterable<User> getAllUsers();

    User getUserByName(String name);

}
