// OOPS Problem of the Week 

// 1. Interface + Implementation
interface test
{
    int square(int x);
}

class arithmetic implements test
{
    @Override
    public int square(int x)
    {
        return x * x;
    }
}

class ToTestInt
{
    public void run()
    {
        arithmetic obj = new arithmetic();
        System.out.println("Square of 5: " + obj.square(5));
    }
}

// 2. Outer + Inner Class
class Outer
{
    void display()
    {
        System.out.println("Display from Outer class");
    }

    class Inner
    {
        void display()
        {
            System.out.println("Display from Inner class");
        }
    }
}

// 3. Point Class
class Point
{
    private int x, y;

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void printPoint()
    {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

// 4. Box and Box3D
class Box
{
    protected double length, breadth;

    public Box(double l, double b)
    {
        this.length = l;
        this.breadth = b;
    }

    public double area()
    {
        return length * breadth;
    }
}

class Box3D extends Box
{
    private double height;

    public Box3D(double l, double b, double h)
    {
        super(l, b);
        this.height = h;
    }

    public double volume()
    {
        return length * breadth * height;
    }
}

// Main driver class
public class OOPSProblems
{
    public static void main(String[] args)
    {
        // Problem 1
        System.out.println("=== Problem 1: Interface Implementation ===");
        ToTestInt tester = new ToTestInt();
        tester.run();

        // Problem 2
        System.out.println("\n=== Problem 2: Outer and Inner Class ===");
        Outer outer = new Outer();
        outer.display();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Problem 3
        System.out.println("\n=== Problem 3: Point Class ===");
        Point p1 = new Point();
        p1.printPoint();
        Point p2 = new Point(3, 4);
        p2.printPoint();
        p2.setXY(7, 8);
        p2.printPoint();

        // Problem 4
        System.out.println("\n=== Problem 4: Box and Box3D ===");
        Box box = new Box(5, 4);
        System.out.println("Area of Box: " + box.area());
        Box3D box3d = new Box3D(5, 4, 3);
        System.out.println("Volume of Box3D: " + box3d.volume());
    }
}
