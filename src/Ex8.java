import java.util.Scanner;

public class Ex8 {

    public static double calculateAverage(double number1, double number2, double number3)
    {
        double sum=number1+number2+number3;
        return sum/3;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 3 number");
        double number1= scanner.nextInt();
        double number2= scanner.nextInt();
        double number3= scanner.nextInt();
        calculateAverage(number1,number2,number3);

    }
}
