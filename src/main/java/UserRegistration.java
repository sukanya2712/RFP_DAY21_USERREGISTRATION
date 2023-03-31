import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    static Pattern firstName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    public boolean checkFirstName(String name) {
        Matcher matcher = firstName.matcher(name);
        if (matcher.matches()){
            return true;
        }else {

            return false;
        }
    }
}
