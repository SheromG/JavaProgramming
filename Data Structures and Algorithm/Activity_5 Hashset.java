import java.util.*;

public class Main 
{
    public static void main(String args[])
    {
            String[] first = {"1","2","3","5","Alpha","Beta","Gamma","Delta"};
            String[] second = {"Alpha","Bravo","Charlie","Delta","1","3","5","7","9"};
            
            HashSet <String> A = new HashSet <String>();
            HashSet <String> B = new HashSet <String>();
            
            for(int x = 0; x < first.length; x++)
            {A.add(first[x]);}
            for(int y = 0; y < second.length; y++)
            {B.add(second[y]);}
        
            System.out.println("The values in Set 1 are: "+ A);
            System.out.println("The values in Set 2 are: "+ B);
            
            A.retainAll(B);
            System.out.println("The Intersection of value: "+ A);
            
            for(int x = 0; x < first.length; x++)
            {A.add(first[x]);}
            
            A.addAll(B);
            System.out.println("The Union of value: "+ A);
    }
}