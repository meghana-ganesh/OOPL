import java.util.*;
abstract class Figure
{
    abstract void area();
    int a,b;
}
class Rectangle extends Figure
{
    Rectangle(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    void area()
    {
        System.out.println("The area of rectangle is:"+a*b);
    }
}
class Triangle extends Figure
{
    Triangle(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    void area()
    {
        System.out.println("The area of the triangle is:"+0.5*a*b);
    }
}
class Square extends Figure
{
    Square(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    void area()
    {
        System.out.println("The area of the square is:"+a*b);
    }
}
class q3
{
    public static void main(String args[])
    {
        Figure f1 = new Rectangle(7,8);
        f1.area();
        Figure f2 = new Square(5,5);
        f2.area();
        Figure f3 = new Triangle(3,4);
        f3.area();
    }
}

