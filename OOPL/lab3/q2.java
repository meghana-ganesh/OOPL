import java.util.Scanner;


class Time
{
    int hrs;
    int mins;
    int secs;
    void setvalues(int h,int m,int s)
    {
        hrs = h;
        mins = m;
        secs = s;
    }
    void display()
    {
        System.out.println(hrs+":"+mins+":"+secs);
    }
    Time add(Time t1,Time t2)
    {
        Time sum = new Time();
        sum.hrs = t1.hrs + t2.hrs;
        sum.mins = t1.mins + t2.mins;
        sum.secs = t1.secs + t2.secs;
        //2:03:40 1:04:60
        //1 min =60 s
        //    ::40
        if(sum.secs>=60)
        {
            sum.secs-=60;
            sum.mins+=1;
        }
        if(sum.mins>=60)
        {
            sum.mins-=60;
            sum.hrs+=1;
        }
        if(sum.hrs>24)
        {
            sum.hrs-=24;
        }

        return sum;
    }
    Time subtract(Time t1,Time t2)
    {
        //2:02:02
        //1:03:03
        Time sub = new Time();
        if(t2.secs>t1.secs)
            {
                t1.mins-=1;
                t1.secs+=60;
                sub.secs = t1.secs - t2.secs;
            }
            else
            {
                sub.secs = t1.secs - t2.secs;
            }
        if(t2.mins>t1.mins)
        {
            t1.hrs-=1;
            t1.mins+=60;
            sub.mins = t1.mins-t2.mins;
        }
        else
            sub.mins = t1.mins - t2.mins;
        if(t2.hrs>t1.hrs)
        {
            System.out.println("Cannot subtract!!");
        }
        else
            sub.hrs = t1.hrs - t2.hrs;
        return sub;
    }
    void Compare(Time t1,Time t2)
    {
        if(t1.hrs==t2.hrs)
        {
            if(t1.mins==t2.mins)
            {
                if(t1.secs==t2.secs)
                {
                    System.out.println("both are equal");
                }
                else if(t1.secs>t2.secs)
                {
                    System.out.println("t1 is greater");
                }
                else
                {
                    System.out.println("t2 is greater");
                }
            }
            else if(t1.mins>t2.mins)
            {
                System.out.println("t1 is greater");
            }
            else
            {
                System.out.println("t2 is greater");
            }
        }
        else if(t1.hrs>t2.hrs)
        {
            System.out.println("t1 is greater");
        }
        else
        {
            System.out.println("t2 is greater");
        }
    }
}

class q2 {
    public static void main(String args[])
    {
        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();
        t1.setvalues(1,10,40);
        t2.setvalues(1,20,60);
        t1.display();
        t2.display();
        result = result.add(t1,t2);
        result.display();
        result = result.subtract(t1,t2);
        result.display();
        result.Compare(t1,t2);

    }
}
