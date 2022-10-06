import java.util.Scanner;
class Mixer
{
    int arr[];
    

    void accept()
    {
        int i;
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        } 
    }
    
    void display()
    {
        int i,n=arr.length;
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    Mixer mix(Mixer A)
    {
        int i,j=0,n1 = arr.length,n2 = A.arr.length;
        int newlen = n1 + n2;
        Mixer result = new Mixer();
        result.arr = new int[newlen];
        for(i=0;i<n1;i++)
        {
            result.arr[i] = arr[i];
        }
            for(i=n1;i<newlen;i++)
        {
            result.arr[i] = A.arr[j];
            j++;
        }
        return result;
        
    }
}
class q3
{
    public static void main(String args[])
    {
        Mixer M1 = new Mixer();
        Mixer M2 = new Mixer();
        Mixer result = new Mixer();
        M1.accept();
        M1.display();
        M2.accept();
        M2.display();
        result = M1.mix(M2);
        result.display();
    }
}
