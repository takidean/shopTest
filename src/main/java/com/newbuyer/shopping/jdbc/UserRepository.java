package com.newbuyer.shopping.jdbc;

import com.newbuyer.shopping.model.Panier;
import com.newbuyer.shopping.model.User;

public interface UserRepository {
    public Integer addUserPoints(User user, Panier panier);
    public Boolean verifyUserAccount(User user);
}
