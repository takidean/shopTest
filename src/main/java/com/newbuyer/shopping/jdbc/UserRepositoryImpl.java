package com.newbuyer.shopping.jdbc;

import com.newbuyer.shopping.model.Panier;
import com.newbuyer.shopping.model.User;
import com.newbuyer.shopping.jdbc.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public Integer addUserPoints(User user, Panier panier) {
        //calculate point and persist them in user table
        return 100;
    }

    @Override
    public Boolean verifyUserAccount(User user) {
        return null;
    }
}
