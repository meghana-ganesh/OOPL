import java.util.Scanner;

class q2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,k,disc;
        double d;
        System.out.println("Enter the coefficients of the quadratic eqn:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        disc = (b*b)-4*a*c;
        d=Math.sqrt(Math.abs(disc));
        if(disc>0)
        k=1;
        else if(disc==0)
        k=2;
        else
        k=3;
        switch(k)
        {
            case 1:
            System.out.println("the roots are real and distinct");
            System.out.println("root 1:"+(-b+d/2*a));
            System.out.println("root 2:"+(-b-d)/2*a);
            break;
            case 2:
            System.out.println("the roots are real and equal");
            System.out.println("root 1 = root 2 ="+(-b/2*a));
            break;
            default:
            System.out.println("the roots are imaginary");
            System.out.println("root1:"+(-b/2*a)+"+"+(d/2*a)+"i");
            System.out.println("root2:"+(-b/2*a)+"-"+(d/2*a)+"i");
            break;
        }
    }
}
