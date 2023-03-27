//========== User's Code Starts Here ==========
class Student
{
    String Name;
    int roll_no;
    Student()
    {
        Name="john";
        roll_no=2;
    }
    Student(String Name,int x)
    {
        this.Name = Name;
        roll_no = x;
    }
    //create the method display below
    void display()
    {
        System.out.println(Name);
        System.out.println(roll_no);
    }
    
    
    
}

//Do not touch the below code
public class Main
{
    public static void main(String []args)
    {
        Student obj =new Student();
        Student obj1=new Student("vaibhav",101);
        Student obj2=new Student("rahul",102);
        obj1.display();
        obj2.display();
        obj.display();
        
        
        
        
        
    }
}

//========== User's Code Ends Here ==========
