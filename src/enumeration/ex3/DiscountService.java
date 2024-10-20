package enumeration.ex3;

import static enumeration.ex3.Grade.GOLD;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if (grade == Grade.BASIC) {
            discountPercent = 10;
        } else if (grade == GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("No Discount");
        }

        // 10000 * (20 / 100) -> 2000
        return price * discountPercent / 100;
    }
}
