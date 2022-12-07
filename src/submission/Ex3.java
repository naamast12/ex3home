package submission;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diamond;
        int space;
        int stopSpace=1;
        do {
            System.out.println("enter odd number bigger then 3");
            diamond = scanner.nextInt();
            space = diamond-1;
        } while (diamond % 2 == 0 || diamond <= 3);

        for (int z = 1; z <= diamond; z=z+2)
        {
            for (int x=0;x<space/2;x++)
            System.out.print(" ");

            for (int i = 0; i < z; i ++)
            {

                System.out.print("*");
            }
            for (int x=0;x<space/2;x++)
            System.out.print(" ");

            System.out.println(" ");
            space = space-2;
        }
        for (int z = diamond-2; z >= 1; z=z-2)
        {
            for (int u=1;u<=stopSpace;u++)
                System.out.print(" ");

            for (int i = 0; i < z; i++)
            {
                System.out.print("*");
            }
            for (int u=1;u<=stopSpace;u++)
                System.out.print(" ");
            stopSpace=stopSpace+1;
            System.out.println("");

        }

    }
}
