import java.util.Scanner;

public class ex6 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter number between 3 to 9");
            number = scanner.nextInt();

        } while (number < 3 || number > 9);

        for (int z = 1; z <= number; z++)
        {
            for (int i = 1; i <= number; i++)
                System.out.print(z);
            System.out.println();

        }

    }
}