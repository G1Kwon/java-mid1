package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        //date1 = x001 date2 = x002
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        //불변객체에서 변경한 값이 있으면 반드시 값을 받아야 한다.
        //안하면 변경한 값이 버려진다.
        date1 = date1.withYear(2025); //date1 = x002 date2 = x001
        System.out.println("date1 = " + date1); //x002
        System.out.println("date2 = " + date2); //x001
    }
}
