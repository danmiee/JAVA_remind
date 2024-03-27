package javajungsuk3.ch6;

// [6-3] 다음과 같은 멤버변수를 갖는 Student 클래스를 정의하시오.
public class Student {
    String name;
    int ban, no, kor, eng, math;

    public Student() {
    }

    // [6-4] 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하시오.
    //// 메서드명 : getTotal
    //// 기능 : 국어(kor), 영어(eng), 수학(math) 점수를 모두 더해서 반환
    //// 반환타입 : int
    //// 매개변수 : 없음
    public int getTotal() {
        return kor + eng + math;
    }
    //// 메서드명 : getAverage
    //// 기능 : 총점(국어+영어+수학)을 과목수로 나눈 평균을 구한다. (소수 둘째자리에서 반올림)
    //// 반환타입 : float
    //// 매개변수 : 없음
    public float getAverage() {
        return Math.round((kor + eng + math) / (float) 3 * 10) / (float) 10.0;
    }

    // [6-5] 다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info()를 추가하시오.
    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        return name + "," + ban + "," + no + "," +
                kor + "," + eng + "," + math + "," +
                getTotal() + "," + getAverage();
    }
}
