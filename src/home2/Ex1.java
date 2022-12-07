package home2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        printBiggerThenAverage();

    }


    public static void printBiggerThenAverage ()
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int average = 0;
        for (int i=0 ; i<10 ; i++)
        {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            array[i] = number;
            average = average + number;
        }
        average = average/10;
        for (int z = 0 ; z<10 ; z++)
        {
            if (array[z]>average)
            {
                System.out.println(array[z]);
            }
        }
    }
}
