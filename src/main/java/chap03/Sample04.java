package chap03;

public class Sample04 {

    public static void main(String[] args) {
        int inc = 1;
        System.out.println(inc++); //후위 : 해당 로직 실행 후 수행되어 이후 출력시 결과확인
        System.out.println(inc); //이전 후위효과로 처리된 결과 반환
    }
}
