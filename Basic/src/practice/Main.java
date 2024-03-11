package practice;

import java.util.List;
import java.util.Scanner;

public class Main {
// 메뉴 만들기
// 1. 회원 등록
// 2. 회원 목록보기
// 3. 프로그램 종료

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Join join = new Join();
        Users users = new Users();
        Search search = new Search(users.getUsers());
        boolean check = true;
        boolean check2 = true;
        int menu, menu2;

        while (check) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("0. 종료 / 1. 회원등록 / 2. 회원목록 / 3. 회원검색");
            menu = sc.nextInt();
            if (menu == 0) {
                System.out.println("프로그램이 종료되었습니다.");
                check = false;
            } else if (menu == 1) {
                User user = join.signUp(users);
                users.addUser(user);
                System.out.println(user);
                System.out.println("회원가입을 축하합니다.");
            } else if (menu == 2) {
                users.displayUser();
            } else if (menu == 3) {
                while (check2) {
                    System.out.println("검색방법을 선택하세요.");
                    System.out.println("0. 뒤로가기 / 1. 이름 / 2. 핸드폰번호");
                    menu2 = sc.nextInt();
                    if (menu2 == 0) {
                        check2 = false;
                    } else if (menu2 == 1) {
                        List<User> result = search.searchByName();
                        System.out.println(result);
                        break;
                    } else if (menu2 == 2) {
                        List<User> result = search.searchByPhone();
                        System.out.println(result);
                        break;
                    } else {
                        System.out.println("목록에 있는 번호를 입력해주세요.");
                    }
                }
            } else {
                System.out.println("목록에 있는 번호를 입력해주세요.");
            }
        }
    }
}