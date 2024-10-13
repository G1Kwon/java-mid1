package enumeration.ref3;

import static enumeration.ref3.Grade.DIAMOND;
import static enumeration.ref3.Grade.GOLD;

public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        System.out.println("BASIC's discount : " + Grade.BASIC.discount(price));
        System.out.println("GOLD's discount : " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND's discount : " + DIAMOND.discount(price));
    }

}
