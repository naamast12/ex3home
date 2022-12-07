package classEx;

public class Exc3 {
    public static void main(String[] args)
    {
        String one = "naamad";
        String two = "shira";
        System.out.println(longest(one, two));

    }

    public static String longest(String one, String two)
    {
        String longer = "The strings are same length";
        if (one.length()>two.length())
        {
            longer = one;
        }
        else
        {
            if (two.length() > one.length())
            {
                longer = two;
            }
        }

          return longer;
    }
}
