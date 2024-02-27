class Calculator
{
    int david, sherom;
    
    public void plus (int a, int b)
    {
        david = a; sherom = b;
        System.out.println("The sum of " + a + " and " + b + " is "+ (a + b) + ".");
    }
    public void minus (int a, int b)
    {
        david = a; sherom = b;
        System.out.println("The difference of " + a + " and " + b + " is "+ (a - b) + ".");
    }
    public void times (int a, int b)
    {
        david = a; sherom = b;
        System.out.println("The product of " + a + " and " + b + " is "+ (a * b)+ ".");
    }
    public void divide (float a, float b)
    {
        float david = a; float sherom = b;
        System.out.println("The quotient of " + a + " and " + b + " is "+ (a / b)+ ".");
    }
}
class Sum extends Calculator
{
    public void addition(int a, int b)
    {
        plus(a,b);
    }
}
class Difference extends Calculator
{
    public void subtraction(int a, int b)
    {
        minus(a,b);
    }
}
class Product extends Calculator
{
    public void multiplication(int a, int b)
    {
        times(a,b);
    }
}
class Quotient extends Calculator
{
    public void division(int a, int b)
    {
        divide(a,b);
    }
}
public class Activity_7 
{ 
    public static void main(String[] args)
    {
     Sum operation1 = new Sum();
     Difference operation2 = new Difference();
     Product operation3 = new Product();
     Quotient operation4 = new Quotient();
     
     operation1.addition(12,8);
     operation2.subtraction(16,1);
     operation3.multiplication(6,9);
     operation4.division(10,4);
    }
}