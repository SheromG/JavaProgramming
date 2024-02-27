import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) 
	{
	    String[] first = {"S","H","E","R","O","M"};
		ArrayList<String> firstname = new ArrayList<>();
		for(int x = 0; x < first.length; x++)
		{
		    firstname.add(first[x]);
		}
		System.out.println("Original Array:" + firstname);
		Collections.sort(firstname);
		System.out.println("Sorted Array:" + firstname);
		
		String[] last = {"G","R","A","N","A","D","A"};
		ArrayList<String> lastname = new ArrayList<>();
		for(int y = 0; y < last.length; y++)
		{
		    lastname.add(last[y]);
		}
		System.out.println("\nOriginal Array:" + lastname);
		Collections.shuffle(lastname);
		System.out.println("Sorted Array:" + lastname);
	}
}
