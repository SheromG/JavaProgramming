import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    static void bubblesort(char var[])
    {
        for(int x = 0; x < var.length - 1; x++)
        {
            for(int y = 0; y < var.length - x - 1; y++)
            {
                if(var[y] > var[y + 1])
                {
                    char z = var[y];
                    var[y] = var[y + 1];
                    var[y + 1] = z;
                }
            }
        }
    }
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String first = input.nextLine();
		System.out.print("Enter your middle name: ");
		String middle = input.nextLine();
		System.out.print("Enter your last name: ");
		String last = input.nextLine();
		
		String full = first+middle+last;
		String fullname = full.toUpperCase();
		
	    char[] array = new char[fullname.length()];
	    for(int a = 0; a < fullname.length(); a++)
		{
		    array[a] = fullname.charAt(a);
		}
		Main.bubblesort(array);
		
		System.out.print("\nYour Name is: " + first + " " + middle + " " + last);
		System.out.print("\nIncreasing order of letter : " + Arrays.toString(array));
	}
}