package lang.object;

//상속받은 것이 있기에 Object 클래스를 상속받지 않는다.
public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
