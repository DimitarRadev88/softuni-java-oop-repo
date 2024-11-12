package com.solid.lab.interfaceSegragation.identity;

import com.solid.lab.interfaceSegragation.identity.interfaces.Account;
import com.solid.lab.interfaceSegragation.identity.interfaces.AccountValidator;
import com.solid.lab.interfaceSegragation.identity.interfaces.UserRepository;

public class AccountManager implements Account {

    private final UserRepository userRepository;
    private final AccountValidator accountValidator;

    public AccountManager(UserRepository userRepository, AccountValidator accountValidator) {
        this.userRepository = userRepository;
        this.accountValidator = accountValidator;
    }

    @Override
    public void register(String username, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void login(String username, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changePassword(String oldPass, String newPass) {
        //change password
    }

    @Override
    public String getPasswordHash() {
        throw new UnsupportedOperationException();
    }

}
