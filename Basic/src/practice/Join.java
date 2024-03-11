package practice;

import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Join {

    public String vdInput(List<User> users, String question, List<String> conditions, int limit, String errMsg, String errDuple) {
        Scanner sc = new Scanner(System.in);
        Validator vd = new Validator();
        String input = null;
        boolean isValid = false;

        while (!isValid) {
            System.out.println(question);
            input = sc.next();
            isValid = true;

            for (String condition : conditions) {
                switch (condition) {
                    case "limit":
                        isValid = vd.isLimited(input, limit);
                        if (!isValid) {
                            System.out.println(errMsg);
                            break;
                        }
                        break;
                    case "id":
                        isValid = vd.isNonDuple(condition, input, users);
                        if(!isValid) {
                            System.out.println(errDuple);
                            break;
                        }
                        isValid = vd.isLowercaseOrNumber(input);
                        if (!isValid) {
                            System.out.println(errMsg);
                            break;
                        }
                        break;
                    case "pw":
                        isValid = vd.isLowercaseOrNumber(input);
                        if (!isValid) {
                            System.out.println(errMsg);
                            break;
                        }
                        break;
                    case "phone":
                        isValid = vd.isNonDuple(condition, input, users);
                        if(!isValid) {
                            System.out.println(errDuple);
                            break;
                        }
                        isValid = vd.isPhone(input);
                        if (!isValid) {
                            System.out.println(errMsg);
                            break;
                        }
                        break;
                    case "email":
                        isValid = vd.isNonDuple(condition, input, users);
                        if(!isValid) {
                            System.out.println(errDuple);
                            break;
                        }
                        isValid = vd.isEmail(input);
                        if (!isValid) {
                            System.out.println(errMsg);
                            break;
                        }
                        break;
                    case "number":
                        isValid = vd.isNumber(input);
                        if (!isValid) {
                            System.out.println(errMsg);
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        return input;
    }
    public String checker(boolean checker, String str, String errMsg) {
        if(checker) {
            return str;
        } else {
            System.out.println(errMsg);
            return null;
        }
    }

//    public String question(List<User> users, String str, String question, List conditions, int limit, String errMsg) {
//        Scanner sc = new Scanner(System.in);
//        Validator vd = new Validator();
//
//        boolean check = false;
//        while (!check) {
//            System.out.println(question);
//            str = sc.next();
//            if (str != null) {
//                if (conditions.contains("limit")) {
//                    check = vd.isLimited(str, limit);
//                    checker(check, str, errMsg);
//                    if (!check) continue;
//                }
//                if (conditions.contains("id") || conditions.contains("pw")) {
//                    check = vd.isLowercaseOrNumber(str);
//                    checker(check, str, errMsg);
//                    if (!check) continue;
//                }
//                if (conditions.contains("phone")) {
//                    check = vd.isPhone(str);
//                    checker(check, str, errMsg);
//                    if (!check) continue;
//                }
//                if (conditions.contains("id") || conditions.contains("phone")) {
//                    check = vd.isDuple(str, users);
//                    checker(check, str, errMsg);
//                    if (!check) continue;
//                }
//                if (conditions.contains("email")) {
//                    check = vd.isEmail(str);
//                    checker(check, str, errMsg);
//                    if (!check) continue;
//                }
//                if (conditions.contains("number")) {
//                    check = vd.isNumber(str);
//                    checker(check, str, errMsg);
//                }
//            }
//        }
//        return (str);
//    }
    public User signUp(Users users) {

        Scanner sc = new Scanner(System.in);

        // String 변수로 먼저 받아서 null 체크 포함하여 조건문 작성
        String id = null;
        String pw = null;
        String pw2;
        String name = null;
        String phone = null;
        String email = null;
        String age = null;
        List conditions = asList("limit", "lowercase or number", "phone", "email", "number");

        List<User> userList = users.getUsers();
        Validator vd = new Validator();

        id = vdInput(userList, "아이디 입력", asList("limit", "id"), 20, "영문 소문자 + 숫자 조합으로 최대 20자 입력 가능합니다.", "중복된 아이디입니다.");
        pw = vdInput(userList, "비밀번호 입력", asList("limit", "pw"), 10, "영문 소문자 + 숫자 조합으로 최대 10자 입력 가능합니다.", "");

        boolean check = true;
        while (check) {
            System.out.println("비밀번호 확인");
            pw2 = sc.next();
            if (pw2 != null && !pw.equals(pw2)) {
                System.out.println("기존 입력한 내용과 같지 않습니다.");
            } else {
                check = false;
            }
        }

        name = vdInput(userList, "성명 입력", asList("limit"), 10, "최대 10자 입력 가능합니다.", "");
        phone = vdInput(userList, "핸드폰번호 입력", asList("phone"), 0, "연락처를 바르게 입력하세요.", "이미 가입한 핸드폰번호입니다.");
        email = vdInput(userList, "이메일주소 입력", asList("email"), 0, "이메일 주소 형식으로 입력하세요.", "중복된 이메일입니다.");
        age = vdInput(userList, "나이 입력", asList("number"), 0, "숫자를 입력하세요.", "");

//        id = question(id, "아이디 입력", asList(conditions.get(0), conditions.get(1)), 20, "영문 소문자 + 숫자 조합으로 최대 20자 입력 가능합니다.");
//        pw = question(pw, "비밀번호 입력", asList(conditions.get(0), conditions.get(1)), 10, "영문 소문자 + 숫자 조합으로 최대 10자 입력 가능합니다.");
//        name = question(name, "성명 입력", asList(conditions.get(0)), 10, "최대 10자 입력 가능합니다.");
//        phone = question(phone, "연락처 입력", asList(conditions.get(2)), 0, "연락처를 바르게 입력하세요.");
//        email = question(email, "이메일주소 입력", asList(conditions.get(3)), 0, "이메일 주소 형식으로 입력하세요.");
//        age = question(age, "나이 입력", asList(conditions.get(4)), 0, "숫자를 입력하세요.");

        User user = new User(id, pw, name, phone, email, age);
        return (user);
    }
}

// while문 메소드로 만들기