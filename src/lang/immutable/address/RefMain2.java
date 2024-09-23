package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {

        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("Seoul");
        ImmutableAddress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("Busan"); // b의 값을 변경해야하나 컴파일 오류가 발생
        b = new ImmutableAddress("Busan");
        System.out.println("a = " + a); //a의 값도 같이 변경
        System.out.println("b = " + b);
    }

}
