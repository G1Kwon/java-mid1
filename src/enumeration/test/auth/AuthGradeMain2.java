package enumeration.test.auth;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your grade [GUEST, LOGIN, ADMIN] : ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("Your grade: " + authGrade.getDescription());

        System.out.println("== MENU ==");
        if (authGrade.getLevel() > 0) {
            System.out.println(" - Main Screen");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println(" - Email Management Screen");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println(" - Admin Screen");
        }
    }
}
