import java.util.*;
class Person
{
    private  String name;
    private int year,month,day;
    void setname(String name)
    {
        this.name = name;
    }
    void setDOB(int y,int m,int d)
    {
        year = y;
        month = m;
        day = d;
    }
    void getnameDOB()
    {
        System.out.println("Name of student:"+name);
        System.out.println("DOB of student:"+day+"/"+month+"/"+year);
    }
}


class CollegeGraduate extends Person
{
    private float GPA;
    private int grad_year;
    CollegeGraduate(String name,int year,int month,int day,float gpa,int grad_year)
    {
        setname(name);
        setDOB(year,month,day);
        GPA = gpa;
        this.grad_year = grad_year;
    }
    void get()
    {
        System.out.println("GPA is:"+GPA);
        System.out.println("Year of graduation is:"+grad_year);
    }
}


class q1 
{
    public static void main(String args[])
    {
        CollegeGraduate cg = new CollegeGraduate("Meghana",2003,02,13,9,2025);
        cg.getnameDOB();
        cg.get();
    }
    

}
    

