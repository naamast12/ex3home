package home2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter quadratic equation");
        String equation = scanner.nextLine();
        if (properQuadraticEquation(equation)) {
            System.out.println(solvingQuadraticEquation(numberA(equation), numberB(equation), numberC(equation)));
        }
        else
            System.out.println("The equation is invalid");

    }
    public static boolean properQuadraticEquation( String equation )
    {
        int placeA = equation.indexOf("x^2");
        int placeBPlus = equation.indexOf("x+");
        int placeBMinus = equation.indexOf("x-");
        int placeBEquals = equation.indexOf("x=");
        int existEqualsZero = equation.indexOf("=0");
        int placeC = -1;
        if (existEqualsZero!=-1)
        {
            if ( equation.indexOf(existEqualsZero -1)!= 'x')
            {
                placeC = existEqualsZero-1;
            }
        }
        boolean properQuadraticEquation = false;
        if ((placeBMinus!=-1||placeBPlus!=-1||placeBEquals!=-1)&&placeA!=-1&&existEqualsZero!=-1)
        {
            if ((placeA < placeBPlus||placeA<placeBMinus||placeA<placeBEquals) && (placeBMinus < placeC ||placeBEquals<placeC||placeBPlus<placeC|| placeC == -1)&&placeC<existEqualsZero&&placeA<existEqualsZero&&(placeBPlus<existEqualsZero&&placeBMinus<existEqualsZero&&placeBEquals<existEqualsZero))
                properQuadraticEquation = true;
        }
        return properQuadraticEquation;
    }
    public static int numberA (String equation)
    {
        int numberA;
        if (equation.charAt(0)=='x')
            numberA = 1;
        else
            if (equation.charAt(0)=='-')
            numberA = -1;
            else
            {
                int indexX = equation.indexOf("x^2");
                numberA = Integer.parseInt(equation.substring(0, indexX));
            }
         return numberA;
    }
    public static int numberB (String equation)
    {
        int numberB;
        int beforB;
        int stopB;
        if (equation.indexOf("-x")!=-1)
            numberB = -1;
        else
            if (equation.indexOf("+x")!=-1)
                numberB = 1;
            else {
                if (equation.indexOf("x+") == -1 && equation.indexOf("x-") == -1)
                    stopB = equation.indexOf("x="); //When there is no c
                else if (equation.indexOf("x-") == -1 && equation.indexOf("x=") == -1)
                    stopB = equation.indexOf("x+");
                else
                    stopB = equation.indexOf("x-");
                if (equation.indexOf("x^2+") == -1)
                    beforB = equation.indexOf("x^2-") + 3;
                else
                    beforB = equation.indexOf("x^2+") + 3;

                    numberB = Integer.parseInt(equation.substring(beforB, stopB));
                }
        return numberB;
    }
    public static int numberC (String equation)
    {
        int numberC;
        int beforC;
        int stopC;
        if (equation.indexOf("x+")==-1&&equation.indexOf("x-")==-1)
            numberC=0;
        else
        {
            if (equation.indexOf("x-") == -1)
                beforC = equation.indexOf("x+")+1;
            else
                beforC = equation.indexOf("x-")+1;

            stopC = equation.indexOf("=0");
            numberC = Integer.parseInt(equation.substring(beforC, stopC));
        }
        return numberC;
    }
    public static String solvingQuadraticEquation(int a, int b, int c)
    {
        String solution ;
        int roofValue = (b * b) + (-4 * a * c);
        double x1 = (-b + Math.sqrt(roofValue))/(2*a);
        double x2 = (-b - Math.sqrt(roofValue))/(2*a);
        if (roofValue < 0)
            solution = "No solution";
        else {
            if (x1 != x2)
                solution = "x1:" + x1 + " , x2:" + x2;
            else
                solution= "The equation has 1 solution:" + x1;
        }
        return solution;
    }
}
