package home2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        char[] arr = {'1','2','3','4','5','6','7','8','9'};
        char symbol= 'x';
        char winner = checkWinner(arr);
        boolean win = false;

       do {
           if (placeSymbolOnBoard(arr, getPositionFromUser(arr), symbol)) {
               if(checkWinner(arr)!= '-') {System.out.println(symbol+ " win"); win= true;}
               break;
           }
           if (symbol=='x')
               symbol='o';
           else  symbol='x';
       }while (winner!=symbol);
       if (win==false)
       System.out.println("no winner");






    }
    public static void printBoard (char[] arr)
    {
        for (int i = 0 ; i < 3 ; i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
        for (int w = 3 ; w < 6 ; w++)
            System.out.print(arr[w]+ " ");
        System.out.println();
        for (int z = 6 ; z < 9 ; z++)
            System.out.print(arr[z]+ " ");
        System.out.println();
    }
    public static boolean isAvailable (char[] arr, int index)
    {
        boolean available = true;
        if (arr[index]=='x'||arr[index]=='o')
            available=false;
        return available;
    }
    public static int getPositionFromUser(char[] arr)
    {
        Scanner scanner = new Scanner(System.in);
        int position;
        System.out.println("enter the position between 1-9");
        position = scanner.nextInt();
        while (position<1||position>9)
        {
            System.out.println("no, enter the position between 1-9");
            position = scanner.nextInt();

        }
        if (isAvailable(arr,position-1)==false)
        {
            System.out.println("isn't available, enter another position between 1-9");
            position = scanner.nextInt();
            while (position<1||position>9)
            {
                System.out.println("no, enter the position between 1-9");
                position = scanner.nextInt();

            }
        } return position-1;
    }
    public static char checkWinner(char[] arr)
    {
        char winner = '-';
        int i = 0;
        while (i==0||i==3||i==6)
        {
            if (arr[i]==arr[i+1]&&arr[i]==arr[i+2])
            {
                winner=arr[i];
                break;
            }
            i= i+3;
        }
        int z = 0;
        while(z==0||z==1||z==2)
        {
            if (arr[z]==arr[z+3]&&arr[z]==arr[z+6]&&arr[z]!='0')
            {
                winner=arr[z];
                break;
            }
            z=z+1;
        }
        if (arr[0]==arr[4]&&arr[0]==arr[8]&&arr[0]!='0') {
            winner = arr[0];
        }
        if (arr[2]==arr[4]&&arr[0]==arr[6]&&arr[2]!='0') {
            winner = arr[0];
        }

        return winner;
    }
    public static boolean placeSymbolOnBoard(char[] arr, int position, char symbol)
    {
        arr[position]=symbol;
        printBoard(arr);
        boolean thereIsWinner=true;
        if (checkWinner(arr)== '-')
            thereIsWinner = false;
        return thereIsWinner;
    }
}
