import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter a positive number");
            number = scanner.nextInt();
        }
            while (number <= 0);
        int factorial=1;
        for (int i=1;i<number;i++)
        {    factorial *=i;

        }
        System.out.println(factorial);

    }
}
