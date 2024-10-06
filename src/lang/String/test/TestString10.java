package lang.String.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        //분리하기
        String[] splitFuilts = fruits.split(",");
        for (String fruit : splitFuilts) {
            System.out.println(fruit);
        }

        //합치기
        String joinedString = String.join("->", splitFuilts);
        System.out.println("joinedString: " + joinedString);
    }
}
