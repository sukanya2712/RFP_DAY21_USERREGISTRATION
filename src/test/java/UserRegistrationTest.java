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
    public void firstNameSadTest(){
        boolean firstName = user.checkFirstName("sukanya");
        Assert.assertFalse(firstName);
    }
    @Test
    public void checkLastNameHappyTest(){
        boolean lastName = user.checkLastName("Vardam");
        Assert.assertTrue(lastName);
    }

    @Test
    public void checkLastNameSadTest(){
        boolean lastName = user.checkLastName("aardam");
        Assert.assertFalse(lastName);
    }
    @Test
    public void phoneNumberHappyTest(){
        boolean phoneNumber = user.checkMobileNumber("919930516251");
        Assert.assertTrue(phoneNumber);
    }

    @Test
    public void passwordHappyTest1(){
        boolean password = user.checkPassword1("Sukanyaam");
        Assert.assertTrue(password);
    }
    @Test
    public void passwordSadTest1(){
        boolean password = user.checkPassword1("Sukanya123");
        Assert.assertFalse(password);
    }

    @Test
    public void passwordHappyTest2(){
        boolean password = user.checkPassword2("Sukanyaam");
        Assert.assertTrue(password);
    }
    @Test
    public void passwordSadTest2(){
        boolean password = user.checkPassword2("Sukanya123");
        Assert.assertFalse(password);
    }

    @Test
    public void passwordHappyTest3(){
        boolean password = user.checkPassword3("Sasdfdghj1");
        Assert.assertTrue(password);
    }
    @Test
    public void passwordSadTest3(){
        boolean password = user.checkPassword3("Sukanyafg");
        Assert.assertFalse(password);
    }

    @Test
    public void passwordHappyTest4(){
        boolean password = user.checkPassword4("Sasdfdg@hj1");
        Assert.assertTrue(password);
    }
    @Test
    public void passwordSadTest4(){
        boolean password = user.checkPassword4("Sukanyafg");
        Assert.assertFalse(password);
    }

}