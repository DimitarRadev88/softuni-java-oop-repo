package com.solid.lab.interfaceSegragation.identity.interfaces;

public interface AccountValidator {

    boolean getRequireUniqueEmail();

    int getMinRequiredPasswordLength();

    int getMaxRequiredPasswordLength();

}
