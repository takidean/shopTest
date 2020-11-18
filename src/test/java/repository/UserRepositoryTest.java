package repository;

import com.newbuyer.shopping.model.Article;
import com.newbuyer.shopping.model.Panier;
import com.newbuyer.shopping.model.User;
import com.newbuyer.shopping.jdbc.UserRepository;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnit4.class)
public class UserRepositoryTest {
    @InjectMocks
    UserRepository userRepository;

    @Test
    public void addUserPointsTest(){
        User user = new User("NoNAme","...",234);
        Panier panier = new Panier(Arrays.asList(new Article(1000L, new BigDecimal("124"), "Article pas cher", "adidas")), LocalDate.now(),new BigDecimal("124"));
        Integer returnedValue=userRepository.addUserPoints(user,panier);
        assertEquals(returnedValue,100);
    }

}
