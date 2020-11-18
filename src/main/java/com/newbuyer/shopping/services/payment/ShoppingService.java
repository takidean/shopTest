package com.newbuyer.shopping.services.payment;

import com.newbuyer.shopping.model.Panier;
import com.newbuyer.shopping.model.User;

public interface ShoppingService {
    public void triggerPayement(Panier panier, User user) throws Exception;
}
