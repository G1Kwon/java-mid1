package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

       //존재하지 않은 등급
        int vip = discountService.discount("VIP", price);

        //오타
        int diamondd = discountService.discount("DIAMONDD", price);

        System.out.println("BASIC's discount : " + basic);
        System.out.println("GOLD's discount : " + gold);
        System.out.println("DIAMOND's discount : " + diamond);
        System.out.println("VIP's discount : " + vip);
        System.out.println("DIAMONDD's discount : " + diamondd);
    }
}
