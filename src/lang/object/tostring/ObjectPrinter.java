package lang.object.tostring;

//추상적인 Object 클래스에 의존하고 있다.
public class ObjectPrinter {

    //OCP
    //OPEN : 새로운 클래스를 추가하고, toString() 을 오버라이딩해서 기능을 확장할 수 있다.
    //CLOSED : 새로운 클래스를 추가해도 Object 와 toString()을 사용하는 클라이언트 코드인 ObjectPrinter 는 변경하지 않아도 된다.

    public static void print(Object obj) {
        String string = "print Object Information " + obj.toString();
        System.out.println(string);
    }
}
