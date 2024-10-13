package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        //객체를 생성하려고 하는 개발자도 있을 것이다
        //이 문제를 해결하려면 private으로 막으면 된다.
/*        ClassGrade newClassGrade= new ClassGrade();
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액 : " + result);*/

    }
}
