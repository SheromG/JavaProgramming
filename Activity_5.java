import java.util.Scanner;

public class Activity_5 

{
    public static float add(float x, float y)
    {return x+y;}
    public static float subtract(float x, float y)
    {return x-y;}
    public static float multiply(float x, float y)
    {return x*y;}
    public static float divide(float x, float y)
    {return x/y;}

    public static void main(String[] args) 
    {
        Scanner number = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        float sherom = number.nextFloat();
        
        System.out.print("Enter Second Number: ");
        float granada = number.nextFloat();
        
        System.out.println("The Sum of two numbers: " + add(sherom,granada));
        System.out.println("The Difference of two numbers: " + subtract(sherom,granada));
        System.out.println("The Product of two numbers: " + multiply(sherom,granada));
        System.out.println("The Quotient of two numbers: " + divide(sherom,granada));
    }   
}
