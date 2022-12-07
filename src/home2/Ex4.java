package home2;

public class Ex4 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,2,1};
        System.out.println(arraySummit(arr));

    }
    public static int arraySummit (int[] arr)
    {
        int check = -1;
        for (int i = 0; i < ((arr.length-1)) ; i++)
        {
            if (arr[i]>=arr[i+1])
            {
                check = i;
                break;
            }
        }
        if (check!=-1){
        for (int z = check; z< (arr.length-1); z++)
        {
            if (arr[z]<=arr[z+1]) {
                check = -1;
                break;
            }
        }
    }
        return  check;

    }

}
