package com.newbuyer.shopping.services.impl;

import com.newbuyer.shopping.model.User;
import com.newbuyer.shopping.services.validation.ValidateAuthentication;
import org.springframework.stereotype.Service;

@Service
public class ValidateAuthenticationImpl implements ValidateAuthentication {
    @Override
    public Boolean validateAuthentication(User user) {
        //Service to authenticate user (through certification , keystore , secrets ...)
            if(user.getPublicKey().equals("")){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }



}
