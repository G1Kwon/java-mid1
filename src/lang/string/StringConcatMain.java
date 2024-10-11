package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {

        String a = "hello"; //x001
        String b = " java"; //x002

        String result1 = a.concat(b);
        String result2 = a + b; // 참고잢은 더할 수가 없다. 그런데 자바에서 String (문자열) 에서 특별히 + 연산을 허용한다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
