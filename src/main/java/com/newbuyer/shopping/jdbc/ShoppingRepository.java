package com.newbuyer.shopping.jdbc;

import com.newbuyer.shopping.model.Panier;

public interface ShoppingRepository {
    public void savePanier(Panier panier);
}
