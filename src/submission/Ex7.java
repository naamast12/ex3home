package submission;

public class Ex7 {
    public static void main(String[] args)
    {

        for (int i=1; i<=1000;i++)
        {
            int unityNumber = i%10;
            int tensNumber= i/10%10;
            int hundredsNumber=i/100%10;

            if (i<10)
            {
                if (Math.pow(unityNumber, 1)==i)
                    System.out.println(i);
            }
            if (i>=10&&i<100)
            {
                if (Math.pow(tensNumber, 2) + Math.pow(unityNumber, 2)==i)
                    System.out.println(i);
            }
            if (i>=100 && i<1000)
            {
                if (Math.pow(hundredsNumber, 3) + Math.pow(tensNumber, 3)+ Math.pow(unityNumber, 3)==i)
                    System.out.println(i);
            }
            if (i==1000)
            {
                if (Math.pow(1000, 4)==i)
                    System.out.println(i);
            }

        }


    }
}

