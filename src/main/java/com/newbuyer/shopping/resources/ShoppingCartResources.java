package com.newbuyer.shopping.resources;

import com.newbuyer.shopping.services.payment.ShoppingService;
import com.newbuyer.shopping.services.validation.ValidateAuthentication;
import com.newbuyer.shopping.model.Panier;
import com.newbuyer.shopping.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase")
public class ShoppingCartResources {
    @Autowired
    ShoppingService shoppingService;

    @Autowired
    ValidateAuthentication validateAuthentication;

    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public String validatePurchasing(@RequestPart Panier panier,@RequestParam User user) throws Exception {

        if(Boolean.FALSE.equals(validateAuthentication.validateAuthentication(user))){
            return  "redirect/badAuthentication";
        }

        shoppingService.triggerPayement(panier,user);
                return "redirect/payementStatus";
    }

}
