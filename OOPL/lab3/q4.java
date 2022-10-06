import java.util.Scanner;

class Stack
{
    int arr[];
    int tos;
    int n;
    void init()
    {
        System.out.println("enter the size of stack:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        tos = -1;
    }
    void push(int ele)
    {
        // System.out.println(tos);
        if(tos == n-1)
        {
            System.out.println("Cannot push!!Stack is full!!");
        }
        else
        {
            arr[++tos] = ele;
            // System.out.println(tos);
        }
    }
    int pop()
    {
        if(tos == -1)
        {
            System.out.println("Cannot pop!!Stack is empty!!");
            return 0;
        }
        else
        {
            return arr[tos--];
        }
    }
    void display()
    {
        for(int i=0;i<tos+1;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}
public class q4 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack();
        s1.init();
        int c;
        int flag=0;
        while(flag!=1)
        {
            System.out.println("Enter your choice 1.Push 2.Pop 3.Display 4.Exit");
            c = sc.nextInt();
            
            switch(c)
        {
            case 1:
                System.out.println("enter the element you want to push:");
                int ele;
                ele = sc.nextInt();
                s1.push(ele);
                break;
            case 2:
                int x = s1.pop();
                if(x != 0)
                {
                    System.out.println("After popping:"+x);
                }
                break;
            case 3:
                s1.display();
                break;
            default:
                flag=1;
                break;
                
        }
        }
        

    }   
}
