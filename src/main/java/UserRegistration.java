import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    static Pattern firstName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    static Pattern lastName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    public boolean checkFirstName(String name) {
        Matcher matcher = firstName.matcher(name);
        if (matcher.matches()){
            return true;
        }else {

            return false;
        }
    }

    //uc2
    public boolean checkLastName(String userName){
        Matcher matcher= lastName.matcher(userName);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    //uc3
    static Pattern mobileNumber = Pattern.compile("^([0-9]{2,4})?[\s]?[0-9]{10}$");
    public boolean checkMobileNumber(String userNumber){
        Matcher matcher= mobileNumber.matcher(userNumber);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    static Pattern passwordRule1 = Pattern.compile("^[A-Z][a-z]{8,}$");
    public boolean checkPassword(String userPassword){
        Matcher matcher= passwordRule1.matcher(userPassword);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
}
