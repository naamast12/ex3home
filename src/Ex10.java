public class Ex10 {
    public static boolean isPrimeNumber(int number1) {
        //הפעולה מחזירה נכון או לא אם המספר ראשוני
        int number2 = number1;
        boolean primery = true;
        for (int i = 2; i < number1; i++) {
            if (number1 % i==0)
            primery = false;
            break;
        }

        return primery;

    }

    public static void main(String[] args) {
        boolean primery = isPrimeNumber(5);
        System.out.println(primery);
    }
}
