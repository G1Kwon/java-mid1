package enumeration.ref3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        // 계산 로직은 다 ENUM 에 있다.
        return grade.discount(price);
    }
}
