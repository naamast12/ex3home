package submission;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number a");
        double a = scanner.nextDouble();
        System.out.println("enter number b");
        double b = scanner.nextDouble();
        System.out.println("enter number c");
        double c = scanner.nextDouble();

        double roofValue = (b * b) + (-4 * a * c);
        double x1 = (-b + Math.sqrt(roofValue))/(2*a);
        double x2 = (-b - Math.sqrt(roofValue))/(2*a);
        if (roofValue < 0)
            System.out.println("There is no solution");
        else {
            if (x1 != x2)
                System.out.println("The equation has two solution:" + x1 + "and" + x2);
            else
                System.out.println("The equation has 1 solution:" + x1);
        }

        }


    }


