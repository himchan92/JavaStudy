package chap02;

public class Sample09 {

    public static void main(String[] args) {
        String a1 = "1234";
        int a2 = Integer.parseInt(a1); //String -> Int

        int b1 = 5678;
        String b2 = Integer.toString(b1);
        String b3 = String.valueOf(b1);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
