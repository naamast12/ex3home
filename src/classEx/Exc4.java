package classEx;

public class Exc4
{
    public static void main(String[] args)
    {
        String one = "naama";
        String two = "naama";
        System.out.println(sameString(one,two));

    }
    public  static boolean sameString (String one, String two)
    {
        boolean same = true;
            for (int i=0 ; i<one.length() ; i++)
            {
                if (one.charAt(i)!= two.charAt(i))
                same = false;

            }
            return  same;

    }
}
