import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isugi=0;
        int number;
        int zugi=0;
        do {
            System.out.println("enter a numbers");
            number = scanner.nextInt();
            if (number %2== 0) zugi = zugi + number;
            else isugi = isugi + number;
        } while (number != 0);
        System.out.println("sum of izugu:" + isugi + "sum of zugi:" + zugi);


    }
}
