package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("Seoul");

        MemberV1 memberA = new MemberV1("memberA", address);
        MemberV1 memberB = new MemberV1("memberB", address);

        //A, B 의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //B의 주소를 부산으로 변경
        memberB.getAddress().setValue("Busan");
        System.out.println("Busan -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
