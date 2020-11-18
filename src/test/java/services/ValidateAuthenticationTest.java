package services;

import com.newbuyer.shopping.model.User;
import com.newbuyer.shopping.services.validation.ValidateAuthentication;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnit4.class)
public class ValidateAuthenticationTest {

    @InjectMocks
    ValidateAuthentication validateAuthentication;

    @Test
    public void validateAuthenticationTest(){
        User user = new User("NoNAme","...",234);
        boolean returnedValue=validateAuthentication.validateAuthentication(user);
        assertEquals(returnedValue,Boolean.FALSE);
    }

}
