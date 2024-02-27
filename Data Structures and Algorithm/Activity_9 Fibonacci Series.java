import java.util.Scanner;

public class Main
{
    public static int terms(int a)
    {
        if(a <= 1)
        {
            return a;
        }
        return terms(a-1) + terms(a-2);
    }
    public static void series(int xyz)
    {
        int x = 0, y = 0, z = 1;

        for (int zyx = 0; zyx < xyz; zyx++)
        {
            x = y;
            y = z;
            z = x + y;
            System.out.print(x + " ");
        }
    }
    
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter a value: ");
		int number = input.nextInt();
		
		System.out.print("The value after " +  number + " terms: " + terms(number)+ "\n");
		System.out.print("Fibonacci Series: ");
		series(number);
	}
}