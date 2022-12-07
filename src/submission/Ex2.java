package submission;

import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("enter difference");
        int differece = scanner.nextInt();
        System.out.println("enter amount");
        int amount = scanner.nextInt();

        for (int i=1; i<=amount;i++)
        {
            System.out.println(firstNumber);
            firstNumber=firstNumber+differece;
        }

    }

}
