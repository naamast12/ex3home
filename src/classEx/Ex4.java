package classEx;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String firstName = scanner.nextLine();
        System.out.println("Enter your family name:");
        String familyName = scanner.nextLine();
        System.out.println(conactMyName(firstName, familyName));
    }
    public static String conactMyName(String firstName, String familyName)
    {
         String fullName= firstName + " " + familyName;
         return  fullName;
    }
}
