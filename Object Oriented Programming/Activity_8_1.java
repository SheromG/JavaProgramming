import java.lang.Math;

interface Shapes
{
    void getArea();
    default void getPerimeter(int side, int num_sides)
    {
        int perimeter = 0;
        for (int x = 0; x < num_sides; x++)
        {
            perimeter += side;
        }
        System.out.println("    Perimeter: " + perimeter);
    }
}
// Shape 1
class Triangle implements Shapes
{
    private int  side, num_sides;
    private double area;

    Triangle (int y, int z)
    {
        this.side = y;
        this.num_sides = z;
    }
    public void getArea()
    {
        // Area Formula = √3 *(Side^2) /4;
        area = ( Math.sqrt(3) * side * side ) / 4;
        System.out.println("    Area: " + area);
    }
}
// Shape 2  
class Pentagon implements Shapes
{
    private int  side, num_sides;
    private double area;

    Pentagon (int y, int z)
    {
        this.side = y;
        this.num_sides = z;
    }
    public void getArea()
    {
        // Area Formula = (√5 * (5 + 2 * √5)) * (Side^2) /4;
        area = Math.sqrt( 5 * (5 + 2 * Math.sqrt(5))) * (side * side ) / 4;
        System.out.println("    Area: " + area);
    }
}
// Shape 3 
class Hexagon implements Shapes
{
    private int  side, num_sides;
    private double area;

    Hexagon (int y, int z)
    {
        this.side = y;
        this.num_sides = z;
    }
    public void getArea()
    {
        // Area Formula = ( 3 * √3) * (Side^2) /2;
        area = (3 * Math.sqrt(3)) * (side * side ) / 2;
        System.out.println("    Area: " + area);
    }
}
public class Activity_8_1 
{
    public static void main(String[] args) 
    {
        Triangle shape_1 = new Triangle(3,3);
        System.out.println("Equilateral triangle: ");
        System.out.println("    Side Length = 3 ");
        shape_1.getArea();
        shape_1.getPerimeter(3,3);
        
        Pentagon shape_2 = new Pentagon(5,5);
        System.out.println("\nRegular Petagon: ");
        System.out.println("    Side Length = 5 ");
        shape_2.getArea();
        shape_2.getPerimeter(5,5);
        
        Hexagon shape_3 = new Hexagon(6,6);
        System.out.println("\nRegular Hexagon: ");
        System.out.println("    Side Length = 6 ");
        shape_3.getArea();
        shape_3.getPerimeter(6,6);
    }
}