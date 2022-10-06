import java.util.*; // * says that all the classes in java.util are imported

class student
{
int regno;
String name;
GregorianCalendar doj;
int semester;
double GPA;
double CGPA;
static int count=0; // counting the no of students = counting the no of objects. Hence, static member
student(String name,GregorianCalendar doj,int semester,double GPA,double CGPA)
{
count++;
this.name=name;
doj=doj;
int year = Integer.valueOf(doj.get(Calendar.YEAR)); //Calendar is abstract class and YEAR is the property
year = year%100;
regno = Integer.valueOf(""+year+String.format("%02d",count)); //
semester=semester;
GPA=GPA;
CGPA=CGPA;
}
void display()
{
System.out.println("name: "+name+"\n"+"regno: "+regno);
}
static void sort(student[] s)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the choice 1. Sort by name 2. Sort by sem and CGPA");
int choice = sc.nextInt();
switch(choice)
{
case 1:
for(int i=0;i<count-1;i++)
{
for(int j=0;j<count-i-1;j++) // 2 for loops just for bubble sorting
{
//for(int k=0;k<s[j].name.length();k++)
//{
if(s[j].name.compareTo(s[j+1].name)>0)                    //.name.charAt(k) > s[j+1].name.charAt(k))
{
student temp;  // reference of the class student. 
temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}}}
break;
case 2:
break;
}
}
static void listnames(student s[],char first)
{
    int i;
    for(i=0;i<count;i++)
    {
        if(s[i].name.charAt(0)==first)
        {
            System.out.println("name "+s[i].name);
        }
    }
}
static void namesubstr(student s[],String sub)
{
    for(int i=0;i<count;i++)
    {
        for(int j=0;j<s[i].name.length();j++)
        {
            if(s[i].name.charAt(j)==sub.charAt(0)&&s[i].name.charAt(j+1)==sub.charAt(1))
            {
                System.out.println("name "+s[i].name);
            }
        }
    }
}
static void initial(student s[])
{
    char temp;
    String tempstr="";
    for(int i=0;i<count;i++)
    {
        int c=0;
        temp=s[i].name.charAt(0);
        tempstr+=temp+".";
        for(int j=0;j<s[i].name.length();j++)
        {
            if(c==2)
            {
                temp=s[i].name.charAt(j);  
                tempstr+=temp; 
            }
            if(s[i].name.charAt(j)==' ')
            {
                c++;
                if(c==1)
                {
                    temp=s[i].name.charAt(j+1);
                    tempstr+=temp+".";
                }
            }
            
        }
        s[i].name=tempstr;
        tempstr="";
    }
}
}
class Lab5ex1
{
public static void main(String[] args)
{
student[] s = new student[3];
Scanner sc =new Scanner(System.in);
for(int i=0;i<2;i++)
{
System.out.println("Enter the student details");
s[i] = new student(sc.nextLine(),new GregorianCalendar(sc.nextInt(),sc.nextInt(),sc.nextInt()),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
sc.nextLine();
// s[i].display();
}
// student.sort(s);
// for(int i=0;i<3;i++)
// s[i].display();
// student.listnames(s,'m');
// student.namesubstr(s,"ganesh");
student.initial(s);
s[0].display();
s[1].display();
}
}
