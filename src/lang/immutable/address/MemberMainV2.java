package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("Seoul");

        MemberV2 memberA = new MemberV2("memberA", address);
        MemberV2 memberB = new MemberV2("memberB", address);

        //A, B 의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //B의 주소를 부산으로 변경
//        memberB.getAddress().setValue("Busan");
        //참조주소를 변경 할 수 없으니 새로운 주소 객체를 만들어서 전달한다.
        memberB.setAddress(new ImmutableAddress("Busan"));
        System.out.println("Busan -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
