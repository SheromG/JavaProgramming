interface Shapes
{
    void getArea();
    default void getPerimeter(int... sides)
    {
        int perimeter = 0;
        for (int count: sides)
        {
            perimeter = perimeter + count;
        }
        System.out.println("\tPerimeter: " + perimeter);
    }
}

class Trapezoid implements Shapes
{
    private int a,b,c,d;
    private float base1, base2, height,area;
    
    Trapezoid (int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        base1 = 7;
        base2 = 8;
        height = 9;
    }
    public void getArea()
    {
        area =  ((base1+base2) * height)/2;
        System.out.println("\tArea: " + area);
    }
}

class Rhombus implements Shapes
{
    private int a,b,c,d;
    private float diagonal1, diagonal2,area;
    
    Rhombus (int a, int b , int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        diagonal1 = 3;
        diagonal2 = 5;
    }
    public void getArea()
    {
        area =  (diagonal1 * diagonal2)/2;
        System.out.println("\tArea: " + area);
    }
}
class Parallelogram implements Shapes
{
    private int a,b,c,d;
    private float base, height, area;
    
    Parallelogram (int a, int b , int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        base = 3;
        height = 4;
    }
    public void getArea()
    {
        area =  base * height;
        System.out.println("\tArea: " + area);
    }
}
public class Activity_8_2
{
    public static void main(String[] args) 
    {
        Trapezoid shape1 = new Trapezoid(0,0,0,0);
        Rhombus shape2 = new Rhombus (0,0,0,0);
        Parallelogram shape3 = new Parallelogram (0,0,0,0);
        
        System.out.println("Trapezoid: ");
        shape1.getPerimeter(7,6,5,4);
        shape1.getArea();
        
        System.out.println("Rhombus: ");
        shape2.getPerimeter(4,4,4,4);
        shape2.getArea();
        
        System.out.println("Parallelogram: ");
        shape3.getPerimeter(5,8,5,8);
        shape3.getArea();
    }
}