package com.company.interfaces;

import com.company.Repositories.UserRepositories;

public interface IUserRepo {

    public boolean checkUsername(String username);

    public boolean checkPassword(String passwprd);
}
