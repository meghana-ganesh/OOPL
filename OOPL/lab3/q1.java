import java.util.Scanner;

class Complex 
{
    int real;
    int img;
    void setvalues(int x,int y)
    {
       real=x;
       img=y;
    }
    void display()
    {
        System.out.println(real+"+"+img+"i");
    }
    Complex add(Complex c1,Complex c2)
    {
        System.out.println("addition");
        Complex sum = new Complex();
        sum.real = c1.real + c2.real;
        sum.img = c1.img + c2.img;
        return sum;
    }
    Complex subtract(Complex c1,Complex c2)
    {
        System.out.println("subtracting");
        Complex sub = new Complex();
        sub.real = Math.abs(c1.real - c2.real);
        sub.img = Math.abs(c1.img - c2.img);
        return sub;
    }
}

class q1 {
    public static void main(String args[])
{
    Complex c1 = new Complex();
    Complex c2 = new Complex();
    Complex result = new Complex();
    c1.setvalues(1,2);
    c2.setvalues(3,2);
    c1.display();
    c2.display();
    System.out.println("the sum is:");
    result = result.add(c1,c2);
    result.display(); 
    result = result.subtract(c1,c2);
    result.display();
    
}
}
