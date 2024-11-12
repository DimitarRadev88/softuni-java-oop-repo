package com.solid.lab.interfaceSegragation.identity;

import com.solid.lab.interfaceSegragation.identity.interfaces.AccountValidator;

public class AccountValidatorImpl implements AccountValidator {

    private boolean requireUniqueEmail;
    private int minRequiredPasswordLength;
    private int maxRequiredPasswordLength;

    @Override
    public boolean getRequireUniqueEmail() {
        return requireUniqueEmail;
    }

    @Override
    public int getMinRequiredPasswordLength() {
        return minRequiredPasswordLength;
    }

    @Override
    public int getMaxRequiredPasswordLength() {
        return maxRequiredPasswordLength;
    }
}
