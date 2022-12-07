import java.util.Scanner;

public class Ex9 {
    public static boolean isEven(int number1)
    {
        //הפעולה מחזירה נכון או לא אם המספר זוגי
        boolean even;
        if (number1 % 2 == 0)
           even= true;
        else
            even= false;
        return even;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number1 = scanner.nextInt();
        boolean answer =  isEven(number1);
        System.out.println(answer);
    }
}
