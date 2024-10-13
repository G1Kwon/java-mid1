package enumeration.ref2;

import static enumeration.ref2.Grade.DIAMOND;
import static enumeration.ref2.Grade.GOLD;

public class EnumRefMain2 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("BASIC's discount : " + basic);
        System.out.println("GOLD's discount : " + gold);
        System.out.println("DIAMOND's discount : " + diamond);
    }
}
