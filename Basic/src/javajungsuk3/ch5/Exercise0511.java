package javajungsuk3.ch5;

// [5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
// 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.
// (1)에 알맞은 코드를 넣어서 완성하시오.
public class Exercise0511 {
    public static void main(String[] args) {
        int[][] score = {
            {100, 100, 100}
            , {20, 20, 20}
            , {30, 30, 30}
            , {40, 40, 40}
            , {50, 50, 50}
        };

        int[][] result = new int[score.length+1][score[0].length+1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                /* (1) 알맞은 코드를 넣어서 완성하시오. */
                result[i][j] = score[i][j];                             // score 배열 복사
                result[score.length][j] += score[i][j];                 // 각 열의 총합
                result[i][score[i].length] += score[i][j];              // 각 행의 총합
                result[score.length][score[i].length] += score[i][j];   // 전체 총합
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}
