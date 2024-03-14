package javajungsuk3.ch4;

// 구구단의 일부분을 다음과 같이 출력하시오.
public class Exercise0412 {
    public static void main(String[] args) {
        // i%3==1 && j==3일 때, 줄바꿈 2회하고 i++, j=1
        // i%3==1 && j<3일 때, 줄바꿈 1회하고 i-=2, j++
        // i%3==0 || i%3==2일 때, 탭하고 i++
        int i=2;
        int j=1;
        while (i<=9 && j<=3) {
            if (i==9) {
                System.out.printf("%d*%d=%d\n", i, j, i*j);
                i--; j++;
            } else if (i%3==0 || i%3==2) {
                System.out.printf("%d*%d=%d\t", i, j, i*j);
                i++;
            } else if (j<3) {
                System.out.printf("%d*%d=%d\n", i, j, i*j);
                i-=2; j++;
            } else {
                System.out.printf("%d*%d=%d\n\n", i, j, i*j);
                i++; j=1;
            }
        }
    }
}
