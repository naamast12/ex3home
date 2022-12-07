package home2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println(correctPhoneNumber(phoneNumber));

    }

    public static String correctPhoneNumber (String phoneNumber) {
        String correctPhone = " ";
        if (phoneNumber.length() == 10) {
            for (int i = 0; i < 10; i++) {
                if (!Character.isDigit(phoneNumber.charAt(i)))
                    break;

            }
            if (phoneNumber.indexOf("05") == 0) {
                correctPhone = "05" + phoneNumber.charAt(2) + "-" + phoneNumber.substring(3);
            }
        }
        if (phoneNumber.length() == 11) {
            for (int z = 0 ; z<11 ; z++)
            {
                if ( z != 3 )
                {
                    if (!Character.isDigit(phoneNumber.charAt(z)))
                        break;
                }

            }
            if (phoneNumber.indexOf("05") == 0 && (phoneNumber.charAt(3) == '-')) {
                correctPhone = phoneNumber;

            }

        }
        if (phoneNumber.length() == 12) {
            for (int w = 0; w < 12; w++) {
                if (!Character.isDigit(phoneNumber.charAt(w)))
                    break;
            }
            if (phoneNumber.indexOf("972") == 0) {
                correctPhone = "05" +phoneNumber.charAt(4)+ "-" + phoneNumber.substring(5);
            }

        }
        return correctPhone;

    }
}
