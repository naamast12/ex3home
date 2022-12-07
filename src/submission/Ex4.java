package submission;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount of prime numbers");
        int amountPrimeNumber = scanner.nextInt();
        int count=amountPrimeNumber;
        int num=2;
        for (int i = 0;i<count;i++)
        {
            if (chekPrimaryNumber(num))
            {
                System.out.println(num);
            }
            else
                count++;
            num++;
        }
    }
    public static boolean chekPrimaryNumber(int num)
    {
        boolean primary=true;

        for (int i =2;i<num;i++)
        {
            if (num % i== 0)
            {
                return false;
            }

        }
        return true;

    }



}
