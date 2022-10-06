import java.util.Scanner;


class q3 {
    public static void main(String args[])
    {
        int n,r;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();
        System.out.println("the factorial is:"+fact(n));
        System.out.println("nCr is:"+fact(n)/(fact(n-r)*fact(r)));
    }
    static int fact(int n)
    {
        int result;
        if(n==0)
            return 1;
        return fact(n-1)*n;
    }
    // int result=1;
    //     if(n==0)
    //         return 1;
    //     return fact(n-1)*n;
}
