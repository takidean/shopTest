package com.newbuyer.shopping.services.impl;

import com.newbuyer.shopping.model.Panier;
import com.newbuyer.shopping.model.User;
import com.newbuyer.shopping.jdbc.ShoppingRepository;
import com.newbuyer.shopping.jdbc.UserRepository;
import com.newbuyer.shopping.services.payment.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    private ShoppingRepository shoppingRepository;

    private UserRepository userRepository;

    @Autowired
    public ShoppingServiceImpl(ShoppingRepository shoppingRepository,UserRepository userRepository){
        this.shoppingRepository=shoppingRepository;
        this.userRepository=userRepository;
    }

    @Override
    public void triggerPayement(Panier panier, User user) throws Exception {
        if(Boolean.FALSE.equals(userRepository.verifyUserAccount(user))){
            throw new Exception("User not found");
        }
        shoppingRepository.savePanier(panier);
        //call the third party application or introduce framework to trigger payment (bank interaction)
        userRepository.addUserPoints(user,panier);
    }
}
