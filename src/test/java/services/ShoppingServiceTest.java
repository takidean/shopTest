package services;

import com.newbuyer.shopping.model.Article;
import com.newbuyer.shopping.model.Panier;
import com.newbuyer.shopping.model.User;
import com.newbuyer.shopping.services.impl.ShoppingServiceImpl;
import com.newbuyer.shopping.jdbc.ShoppingRepository;
import com.newbuyer.shopping.jdbc.UserRepository;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnit4.class)
public class ShoppingServiceTest {

    @Mock
    private ShoppingRepository shoppingRepository;
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    ShoppingServiceImpl shoppingService;


    @Test
    public void shoppingServiceTest() throws Exception {
        User user = new User("NoNAme","...",234);
        Panier panier = new Panier(Arrays.asList(new Article(1000L, new BigDecimal("124"), "Article pas cher", "adidas")), LocalDate.now(),new BigDecimal("124"));

        shoppingService.triggerPayement(panier,user);
        Mockito.verify(userRepository,Mockito.times(1)).verifyUserAccount(user);
        Mockito.verify(shoppingRepository,Mockito.times(1)).savePanier(panier);
    }

}
