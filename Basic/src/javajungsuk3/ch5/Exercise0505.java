package javajungsuk3.ch5;

// [5-5] 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
// (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
// [참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
public class Exercise0505 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;

            /* (1) 알맞은 코드를 넣어 완성하시오. */
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
        /* (2) */
        System.arraycopy(ballArr, 0, ball3, 0, 3);
        // for문으로 할 수도 있지만 이게 더 효율적임

        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }
}
