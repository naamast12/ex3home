package submission;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum = 0;
        while ((number/10)>0)
        {
            sum = sum + (number % 10);
            number = number / 10;


        }
        System.out.println(sum+number);

    }

}
