package classEx;

public class Ex3
{
    public static void main(String[] args)
    {
        char[] arr ={'9','y','ג','!'};
        char toFind = '8';
        System.out.println(indexOf(arr, toFind));

    }
    public static int indexOf (char [] arr, char toFind)
    {
        int checkValue= -1;
        for (int i=0 ; i< arr.length;i++) {
            if (arr[i] == toFind)
            {
                checkValue = i;
                break;
            }
        }
        return checkValue;
    }
}
