import java.util.Scanner;

class Square
{   int side;

    Square (int square)
    {   
        this.side = square;     
    }

    public void getSquare()
    {   int area =  side * side;
        System.out.println("The area of the Square is: " + area); 
    }  
}

class Triangle
{   
    int base,height;

    Triangle (int triangle1, int triangle2)
    {   
        this.base = triangle1;
        this.height = triangle2;    
    }

    public void getTriangle()
    {   double area = (base*height)/2;
        System.out.println("The area of the Triangle is: " + area); 
    }
}

class Rectangle
{   
    int length,width;

    Rectangle (int rectangle1, int rectangle2)
    {   
        this.length = rectangle1;
        this.width = rectangle2;    
    }

    public void getRectangle()
    {   int area = length * width;
        System.out.println("The area of the Rectangle is: " + area); 
    }
}

class Parallelogram
{   
    int base,height;

    Parallelogram (int parallelogram1, int parallelogram2)
    {   
        this.base = parallelogram1;
        this.height = parallelogram2;    
    }

    public void getParallelogram()
    {   int area = base * height;
        System.out.println("The area of the Parallelogram is: " + area); 
    }
}

class Trapezoid
{   
    int shortside,longside,height;

    Trapezoid (int trapezoid1, int trapezoid2, int trapezoid3)
    {   
        this.shortside = trapezoid1;
        this.longside = trapezoid2;
        this.height = trapezoid3;   
    }

    public void getTrapezoid()
    {   double area = (shortside+longside) * 0.5 * height;
        System.out.println("The area of the Trapezoid is: " + area); 
    }
}

class Rhombus
{   
    int diagonal1, diagonal2;

    Rhombus (int rhombus1, int rhombus2)
    {   
        this.diagonal1 = rhombus1;
        this.diagonal2 = rhombus2;    
    }

    public void getRhombus()
    {   double area = (diagonal1 * diagonal2) * 0.5;
        System.out.println("The area of the Rhombus is: " + area); 
    }
}

class Pentagon
{  
    int side;

    Pentagon (int pentagon)
    {   
        this.side = pentagon;      
    }

    public void getPentagon()
    {   float area = (float) (0.25 * side * side * (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5))))));
        System.out.println("The area of the Pentagon is: " + area); 
    }
}

public class Midterms 
{

    public static void main(String[] args) 
    {
        System.out.println("******** Welcome to the Shape Calculator ********\n");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the side of the Square: ");
        int sidesquare = input.nextInt();
        System.out.print("Input the base of the Triangle: ");
        int basetriangle = input.nextInt();
        System.out.print("Input the height of the Triangle: ");
        int heighttriangle = input.nextInt();
        System.out.print("Input the legnth of the Rectangle: ");
        int lengthrectangle = input.nextInt();
        System.out.print("Input the width of the Rectangle: ");
        int widthrectangle = input.nextInt();
        System.out.print("Input the base of the Parallelogram: ");
        int baseparallelogram = input.nextInt();
        System.out.print("Input the height of the Parallelogram: ");
        int heightparallelogram = input.nextInt();
        System.out.print("Input the short side of the Trapezoid: ");
        int shorttrapezoid = input.nextInt();
        System.out.print("Input the long side of the Trapezoid: ");
        int longtrapezoid = input.nextInt();
        System.out.print("Input the height of the Trapezoid: ");
        int heighttrapezoid = input.nextInt();
        System.out.print("Input the legnth of the first diagonal of the  Rhombus: ");
        int diagonalrhombus1 = input.nextInt();
        System.out.print("Input the legnth of the second diagonal of the  Rhombus: ");
        int diagonalrhombus2 = input.nextInt();
        System.out.print("Input the side of the Pentagon: ");
        int sidepentagon = input.nextInt();
        
        Square shape1 = new Square(sidesquare);
        Triangle shape2 = new Triangle(basetriangle,heighttriangle);
        Rectangle shape3 = new Rectangle(lengthrectangle,widthrectangle);
        Parallelogram shape4 = new Parallelogram(baseparallelogram, heightparallelogram);
        Trapezoid shape5 = new Trapezoid(shorttrapezoid, longtrapezoid, heighttrapezoid);
        Rhombus shape6 = new Rhombus(diagonalrhombus1, diagonalrhombus2);
        Pentagon shape7 = new Pentagon(sidepentagon);
        
        System.out.println("\n******** The Results are ********");
        shape1.getSquare();
        shape2.getTriangle();
        shape3.getRectangle();
        shape4.getParallelogram();
        shape5.getTrapezoid();
        shape6.getRhombus();
        shape7.getPentagon();
    }  
}