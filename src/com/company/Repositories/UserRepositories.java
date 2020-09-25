package com.company.Repositories;

import com.company.interfaces.IUserRepo;

public class UserRepositories implements IUserRepo {

    @Override
    public boolean checkUsername(String username) {
        if(username.length()<3) return false;
        return true;
    }

    @Override
    public boolean checkPassword(String passwprd) {
        if(passwprd.length()<3 || passwprd.length() > 9) return false;
        return true;
    }
}
