package enumeration.ref1;

public class ClassGradeRefMain1 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC's discount : " + basic);
        System.out.println("GOLD's discount : " + gold);
        System.out.println("DIAMOND's discount : " + diamond);
    }
}
