package submission;

import java.util.Scanner;

public class Ex5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int x1 = 0;
        int x2 = 1;
        int x3;
        boolean isInTheSeries=false;
        if (number==0)
        {
            System.out.println("true");
            isInTheSeries = true;
        }
        for (int i=0;i<number;i++)
        {
            x3=x1+x2;
            x1=x2;
            x2=x3;

            if (number==x3)
            {
                System.out.println("true");
                isInTheSeries=true;
                break;
            }
        }
        if (isInTheSeries==false)
            System.out.println("false");


    }

}
