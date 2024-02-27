import java.util.Scanner;
import java.util.ArrayList;


public class Main
{
    public static void compare (char[]one, char[]two)
    {
        int small = (one.length >= two.length) ? two.length : one.length;
        char[] var = new char[small];

        for (int x = 0; x < small; x++)
        {
            if (one[x] == two[x])
            {
                var[x] = one[x];
            }
            else
            {
                var[x] = ' ';
            }
        }
        ArrayList<Character> lcs = new ArrayList<Character>();
        for(int x = 0; x < var.length; x++)
        {
            lcs.add(var[x]);
        }
        System.out.print("Longest Common Subsequence: ");
        System.out.println(var);
        System.out.print("Comparison of two strings: ");
        System.out.println(lcs);
    }

    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);

        System.out.print ("Enter first string: ");
        String first = input.nextLine ();

        System.out.print ("Enter second string: ");
        String second = input.nextLine ();

        int size1 = first.length ();
        char[] una = new char[size1];
        for (int i = 0; i < size1; i++)
        {
            una[i] = first.charAt (i);
        }

        int size2 = second.length ();
        char[] dalawa = new char[size2];
        for (int i = 0; i < size2; i++)
        {
            dalawa[i] = second.charAt (i);
        }

        compare (una, dalawa);
    }
}