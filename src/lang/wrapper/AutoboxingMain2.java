package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //primitive -> Wrapper (Auto Boxing)
        int value = 7;
        Integer boxedValue = value;

        //Wrapper -> Primitive (Auto Unboxing)
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
