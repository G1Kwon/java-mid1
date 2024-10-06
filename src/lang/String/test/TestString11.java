package lang.String.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder reverseBuilder = new StringBuilder(str).reverse();
        System.out.println(reverseBuilder);
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
