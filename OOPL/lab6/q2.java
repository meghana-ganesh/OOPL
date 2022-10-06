import java.util.*;

class Building
{
    private int area,stories;
    void setBuild(int area,int stories)
    {
        this.area = area;
        this.stories = stories;
    }
    void getBuild()
    {
        System.out.println("The area is:"+area);
        System.out.println("No. of stories:"+stories);
    }
}
class House extends Building
{
    private int beds,baths;
    void set(int beds,int baths)
    {
        this.beds = beds;
        this.baths = baths;
    }
    void get()
    {
        System.out.println("The no. of bedrooms are:"+beds);
        System.out.println("The no. of baths are:"+baths);
    }
}

class School extends Building
{
    private int classrooms;
    private String grade_level;
    void set(int classrooms,String grade_level)
    {
        this.classrooms = classrooms;
        this.grade_level = grade_level;
    }
    void get()
    {
        System.out.println("The no. of classrooms are:"+classrooms);
        System.out.println("The grade level is:"+grade_level);
    }
}

class q2 
{
    public static void main(String args[])
    {
       House h1 = new House();
       School s1 = new School();
       h1.setBuild(5000,2);
       h1.getBuild();
       h1.set(3,2);
       h1.get();
       s1.setBuild(8000,3);
       s1.getBuild();
       s1.set(10,"Junior high");
       s1.get();
        
    }
}
