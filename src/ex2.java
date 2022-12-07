import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number");
        int number = scanner.nextInt();
        while (number<=0){
            System.out.println("please enter number");
            number = scanner.nextInt();
        }

        System.out.println(number);

        }



    }
