import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    
	    int[] number = new int[20];
	    for(int a = 0; a < number.length; a++)
	    {
	      number[a] = a+1;  
	    }
        ArrayList<Integer> number_data = new ArrayList<>();
        for(int b = 0; b < number.length; b++)
		{
		    number_data.add(number[b]);
		}
        
	    String letters = "ABCDEFBHIJKLMN";
	    char[] letter = new char[letters.length()];
	    for(int x = 0; x < letters.length(); x++)
		{
		    letter[x] = letters.charAt(x);
		}
		ArrayList<Character> letter_data = new ArrayList<>();
		for(int z = 0; z < letter.length; z++)
		{
		    letter_data.add(letter[z]);
		}

		System.out.print("Enter a number: ");
		int input1 = input.nextInt();
		System.out.print("Enter a letter: ");
		char input2 = input.next().charAt(0);
		
		System.out.println("Number list: " + number_data);
		int data1 = Collections.binarySearch(number_data, input1);
		System.out.println("The number " + input1 + " is in position " + data1);
		
		System.out.println("Letter list: " + letter_data);
		int data2 = Collections.binarySearch(letter_data, input2);
		System.out.println("The letter " + input2 + " is in position " + data2);
	}
}