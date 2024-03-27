package javajungsuk3.ch6;

// [6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
// [Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
public class Exercise0606 {
    // 두 점 (x,y)와 (x2, y1) 간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1) {
        /* (1) 알맞은 코드를 넣어 완성하시오. */
        return Math.sqrt(Math.pow(x-x1, 2)+Math.pow(y-y1,2));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
