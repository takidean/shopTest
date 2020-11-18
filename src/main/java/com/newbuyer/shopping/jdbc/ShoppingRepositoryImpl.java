package com.newbuyer.shopping.jdbc;

import com.newbuyer.shopping.model.Panier;
import com.newbuyer.shopping.jdbc.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShoppingRepositoryImpl implements ShoppingRepository {

    @Autowired
    public ShoppingRepositoryImpl(){
        //instanciate the module that will persist data here jdbcTemplate,Repository ...;
    }

    @Override
    public void savePanier(Panier panier) {
        // call method to persist data in database ( jpa repository , jdbcTemplate ... )
    }
}
