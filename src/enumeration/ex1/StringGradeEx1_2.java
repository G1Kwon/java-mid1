package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않은 등급
        //애초에 받을 수 있는 인자에 String을 넣으면 안된다.
        int vip = discountService.discount("VIP", price);

        //오타
        int diamondd = discountService.discount("DIAMONDD", price);

        //소문자 입력
        int gold = discountService.discount("gold", price);

        System.out.println("VIP's discount : " + vip);
        System.out.println("DIAMONDD's discount : " + diamondd);
        System.out.println("gold's discount : " + gold);
    }
}
