import java.util.Scanner;
class q4 {
    public static void main(String args[])
    {
        int n,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer:");
        n = sc.nextInt();
        k=isPrime(n);
        if(k==1)
            System.out.println("the no. is prime");
        else
        System.out.println("the number is not prime");
        for(int i=0;i<=n;i++)
        {
            if(isPrime(i)==1)
                System.out.println(i+" ");
        }
    }
    static int isPrime(int n)
    {
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }  
        }
        if(count==1)
            return 1;
        else 
            return 0;
    }
}
