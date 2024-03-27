package javajungsuk3.ch6;


// [6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
// 타입         변수명         설명
// int          num            카드의 숫자. (1~10 사이의 정수)
// boolean      isKwang         광(光)이면 true, 아니면 false
public class SutdaCard {
    int num = (int)(Math.random() * 10 + 1);
    boolean isKwang;

    public SutdaCard() {
        this.num = 1;
        this.isKwang = true;
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        String str = Integer.toString(num);
        if (isKwang) {
            str += "K";
        }
        return str;
    }
}
