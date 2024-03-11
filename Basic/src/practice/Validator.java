package practice;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {

    public boolean isLimited(String str, int limit) {
        if (str != null && str.length() > limit) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isLowercaseOrNumber(String str) {
        return str.matches("[a-z0-9]+");
    }

    public boolean isPhone(String str) {
        return Pattern.matches("^\\d{2,3}\\d{3,4}\\d{4}$", str);
    }

    public boolean isEmail(String str) {
        return Pattern.matches("^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$", str);
    }

    public boolean isNumber(String str) {
        return  Pattern.matches("\\d+",  str);
    }

    public boolean isNonDuple(String cond, String str, List<User> users) {

//        if ("id".equals(cond) && user.getId().equals(str)) {
//            users.stream().filter(a -> str.equals(a.getId())).findAny().orElse(null);
//        }

        for (User user : users) {
            if ("id".equals(cond) && user.getId().equals(str)) {
                return false;
            }
            if ("phone".equals(cond) && user.getPhone().equals(str)) {
                return false;
            }
            if ("email".equals(cond) && user.getEmail().equals(str)) {
                return false;
            }
        }
        return true;
    }
}
