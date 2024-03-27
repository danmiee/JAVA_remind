package javajungsuk3.ch6;

// [6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
// [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
// 메서드명 : shuffle 
// 기능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//        처리한 배열을 반환한다.
// 반환타입 : int[]
// 매개변수 : int[] arr - 정수값이 담긴 배열
public class Exercise0620 {
    static int[] shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ranNum = (int)(Math.random()*arr.length);
            int tmp = arr[i];
            arr[i] = arr[ranNum];
            arr[ranNum] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
