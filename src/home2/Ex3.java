package home2;

import java.util.Scanner;

    public class Ex3 {
        public static void main(String[] args)
        {
            int[] arr = {0,1, 2, 6, 6, 6, 7, 9,0,7,3};
            for (int i = 0; i< finalArrLength(arrayWithoutDuplicates(arr));i++)
                System.out.print(arrayWithoutDuplicates(arr)[i]);


        }

        public static int[] arrayWithoutDuplicates(int[] arr)
        {
            int newArr[] = new int[arr.length];
            boolean check = true;
            int existZero = -1;
            for (int y = 0;y<newArr.length;y++) {
                if (arr[y]==0) {
                    existZero = y;
                    break;
                }
            }
            for (int i = arr.length-1; i >=0 ; i--)
            {
                int exist = 0;
                for (int z = i-1; z >=0 ; z--)
                {
                    if (arr[i] == arr[z] && i != z)
                    {
                        check = false;
                        exist++;
                        break;

                    }
                }

               if (check==true && exist==1|| exist== 0)
               {
                   newArr[i] = arr[i];
               }

            }
            int zeroAmount = 0;
            for (int x = 0 ; x< newArr.length; x++)
                if (newArr[x]==0)
                    zeroAmount++;
            if (existZero!=-1) zeroAmount--;
            int amountFinalArr = newArr.length - zeroAmount;
            int[] finalArr = new int[amountFinalArr];
            int finalArrPlace=0;
            for (int q = 0; q < newArr.length; q++)
                if (newArr[q]!=0||existZero==q) {
                    finalArr[finalArrPlace] = newArr[q];
                    finalArrPlace++;
                }
            return finalArr;

        }
        public static int finalArrLength(int[] arr)
        {
            int finalArrLength = arr.length;
            return finalArrLength;
        }
    }
