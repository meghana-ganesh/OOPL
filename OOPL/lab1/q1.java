import java.util.Scanner;


class q1
{
    public static void main(String args[])
{
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the 3 no.s:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    System.out.println("the largest no. is:"+largest(a,b,c));

}
static int largest(int a,int b,int c)
{
    if(a>c && a>b)
    {
        return a;
    }
    else if(b>a && b>c)
    {
        return b;
    }
    else
    {
        return c;
    }
}
}




