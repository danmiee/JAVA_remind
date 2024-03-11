package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

    private List<User> users;

    public Search(List<User> users) {
        this.users = users;
    }

    public List<User> scInput(List<User> users, String question, String condition) {
        Scanner sc = new Scanner(System.in);
        String input = null;
        List<User> result = new ArrayList<>();

        System.out.println(question);
        input = sc.next();

        for (User user : users) {
            switch (condition) {
                case "name":
                    if (user.getName().equals(input)) {
                        result.add(user);
                    }
                case "phone":
                    if (user.getPhone().equals(input)) {
                        result.add(user);
                    }
                default:
                    break;
            }
        }
        if (result.size() == 0) {
            System.out.println("검색결과가 없습니다.");
        }
        return result;
    }

    public List<User> searchByName() {
        List<User> result = scInput(users, "이름 검색", "name");
        return result;
    }

    public List<User> searchByPhone() {
        List<User> result = scInput(users, "핸드폰번호 검색", "phone");
        return result;
    }
}
