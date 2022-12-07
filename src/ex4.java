import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int base= scanner.nextInt();
        int exponent= scanner.nextInt();
        int result=0;
            System.out.println("enter first numbers");
            base= scanner.nextInt();
            System.out.println("enter second numbers");
            exponent= scanner.nextInt();
            for(int i=1;i<=exponent;i++)
                result = result*base;
            System.out.println("result is:"+ result);


        }

}
