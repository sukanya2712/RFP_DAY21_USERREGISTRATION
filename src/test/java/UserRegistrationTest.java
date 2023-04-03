import org.junit.Assert;
import org.junit.Before;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    UserRegistration user ;
    @BeforeEach
    public void initialize(){
        user = new UserRegistration();
    }
    @Test
    public void firstNameHappyTest(){
        boolean result = user.checkFirstName("Sukanya");
        Assert.assertEquals(true,result);
    }

    @Test
    public void checkLastNameHappyTest(){
        boolean lastName = user.checkLastName("Vardam");
        Assert.assertTrue(lastName);
    }

    @Test
    public void phoneNumberHappyTest(){
        boolean phoneNumber = user.checkMobileNumber("919930516251");
        Assert.assertTrue(phoneNumber);
    }

}