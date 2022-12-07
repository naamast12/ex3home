public class Ex11 {

    public static boolean isPythagoreanTriple(int number1, int number2, int number3)
    {
        // הפעולה מחזירה אמת אם השלשה היא פיתגורית ולהיפך
        boolean pythagorean = true;
        if (((number1 * number1) + (number2 * number2)) != (number3 * number3))
            pythagorean = false;
        return pythagorean;
    }


    public static void main(String[] args) {
        boolean primery = isPythagoreanTriple(3, 4, 5);
        System.out.println(primery);
    }
}

