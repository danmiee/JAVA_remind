package javajungsuk3.ch5;

// [5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
public class Exercise0504 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float average = 0;

        /* (1) 알맞은 코드를 넣어 완성하시오. */
        for (int[] ints : arr) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        average = total / (float)(arr.length * arr[0].length);

        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}
