package chap02;

public class Sample17 {

    public static void main(String[] args) {
        //JDK 1.8 문법: Math.random()
        int num = (int)(Math.random() * 3 + 1);
        System.out.printf("난수 : %d", num);
    }
}
