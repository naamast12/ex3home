package home2;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] secretCode= theRandomNumber();
        System.out.println();
        System.out.println("we play guess the number");
        System.out.println("you need to guess number with 4 digit and every digit between 1-6");
        System.out.println("if you try to guess number with at least 2 same digits i take from you 2 turns");
        System.out.println("Which route will you choose?: easy, hard, medium or surprising");
        String levelPlay = scanner.nextLine();
        while (!properLevelOfPlay(levelPlay)){
            System.out.println("not proper level, which route will you choose?: easy, hard, medium or surprising");
            levelPlay = scanner.nextLine();
        }
        if (levelPlay.equals("easy"))
            easy_Medium_HardLevel(20, secretCode);
        if (levelPlay.equals("hard"))
            easy_Medium_HardLevel(10, secretCode);
        if (levelPlay.equals("medium"))
           easy_Medium_HardLevel(15,secretCode);
        if (levelPlay.equals("surprising"))
            surprisingLevel(secretCode);


    }
    public static int[] theRandomNumber ()
    {
        Random random = new Random();
        int[] arrRandon = new int[4];
        int error0 = -1;
        int error1 = -1;
        int error2 = -1;
        for (int i = 0; i < arrRandon.length; i++)
            do {
                arrRandon[i] = random.nextInt(1, 7);
                if (i == 0)
                    error0 = arrRandon[i];
                if (i == 1)
                    error1 = arrRandon[i];
                if (i == 2)
                    error2 = arrRandon[i];

            } while (error0 == arrRandon[1] || error1 == arrRandon[2] || error0==arrRandon[2]||error0==arrRandon[3]||error1==arrRandon[3]||error2==arrRandon[3]);
        return arrRandon;
    }
    public static boolean properLevelOfPlay(String levelPlay)
    {
        boolean proper=false;
        if (levelPlay.equals("easy") || levelPlay.equals("hard") || levelPlay.equals("medium") || levelPlay.equals("surprising"))
            proper=true;
        return proper;
    }

    public static int[] tryCode()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a trial");
        String tryCode = scanner.nextLine();
        int tryCodeLength = tryCode.length();
        int[] arrTry = new int[tryCodeLength];
        for (int i = 0; i<tryCodeLength; i++)
        {
            arrTry[i] = Integer.parseInt(String.valueOf(tryCode.charAt(i)));
        }
        return arrTry;
    }
    public static boolean properTryCode (int[] arrtry)
    {
        boolean proper = true;
        if (arrtry.length!=4)
            proper = false;

         else
             for (int i=0; i<4; i++)
       {
           if (arrtry[i]>6||arrtry[i]<1)
               proper=false;
       }
            return  proper;
    }
    public static boolean doubleNumberTry(int[] tryCode)
    {
        boolean doubleNumberTry = true;
        int error0 = -1;
        int error1 = -1;
        int error2 = -1;
        for (int i = 0; i< tryCode.length; i++)
        {
            if(i==0) error0=tryCode[i];
            if(i==1) error1=tryCode[i];
            if(i==2) error2=tryCode[i];
        }
        if (tryCode[1]==error0||tryCode[2]==error0||tryCode[2]==error1||tryCode[3]==error0||tryCode[3]==error1||tryCode[3]==error2)
            doubleNumberTry = false;
        return doubleNumberTry;
    }

    public static void easy_Medium_HardLevel(int count, int[] secretCode)
            {
                boolean winner=false;
                boolean doubleCheck = false;

                for (int r = 0; r<count;r++)
                {
                    int accurate=0;
                    int partly=0;
                    int[] theTry= tryCode();
                    while (!properTryCode(theTry))
                    {
                        System.out.println("Invalid code");
                        theTry=tryCode();
                    }
                    if (!doubleNumberTry(theTry)) {
                        doubleCheck=true;
                        System.out.println("Illegal guess, you lost 2 attempts");
                        if (count>=1)
                            count --;
                        else count=0;
                    }
                    for (int z = 0; z < 4; z++) {
                        if (theTry[z] == secretCode[z]) {
                            accurate++;
                        }

                        for (int w = 0; w < 4; w++) {
                            if (w == z && w != 3 && z != 3) w++;
                            if (theTry[z] == secretCode[w]&&theTry[z] != secretCode[z]) {
                                partly++;
                            }
                        }
                    } if (!doubleCheck) count--;
                    if (accurate==4)
                    {
                        winner = true;
                        break;
                    }
                    System.out.println("Amount of accurately guessed digits:"+accurate);
                    System.out.println("Number of partially guessed digits:"+partly);
                }
                if (winner)
                    System.out.println("you win");
                else
                    System.out.println("you lost");
            }

    public static void surprisingLevel( int[] secretCode)
    {
        boolean winner=false;
        boolean doubleCheck = false;
        Random random=new Random();
        int count= random.nextInt(5,25);
        for (int r = 0; r<count;r++)
        {
            int accurate=0;
            int partly=0;
            int[] theTry= tryCode();
            while (!properTryCode(theTry))
            {
                System.out.println("Invalid code");
                theTry=tryCode();
            }
            if (!doubleNumberTry(theTry)) {
                System.out.println("Illegal guess, you lost 2 attempts");
                if (count>=1)
                    count = count - 1;
                else count=0;
            }
            for (int z = 0; z < 4; z++) {
                if (theTry[z] == secretCode[z]) {
                    accurate++;
                }

                for (int w = 0; w < 4; w++) {
                    if (w == z && w != 3 && z != 3) w++;
                    if (theTry[z] == secretCode[w]&&theTry[z] != secretCode[z]) {
                        partly++;
                    }
                }
            }if (!doubleCheck) count--;
            if (accurate==4)
            {
                winner = true;
                break;
            }
        }
        if (winner)
        System.out.println("you win");
        else
            System.out.println("you lost");
    }

    }

