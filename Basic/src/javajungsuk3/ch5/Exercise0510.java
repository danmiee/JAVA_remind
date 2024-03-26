package javajungsuk3.ch5;

// [5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
// (1)에 알맞은 코드를 넣어 완성하시요.
// a b c d e f g h i j k l m n o p q r s t u v w x y z 0 1 2 3 4 5 6 7 8 9
// ` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . / q w e r t y u i o p
public class Exercise0510 {
    public static void main(String[] args) {
        char[] abcCode = {
            '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
            '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
            '}', ';', ':', ',', '.', '/'
        };
        char[] numCode = {
            'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'
        };
        String src = "abc123";
        String result = "";

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            /* (1) 알맞은 코드를 넣어 완성하시오. */
            if (ch < 'a') {
                result += numCode[ch - '0'];
            } else {
                result += abcCode[ch - 'a'];
            }
        }

        System.out.println("src:"+src);
        System.out.println("result:"+result);
    }
}
