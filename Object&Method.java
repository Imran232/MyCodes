//========== User's Code Starts Here ==========
class Employee
{
    //Write the code here
    int salary;
    int working_hours;
    public void getInfo(int salary,int working_hours)
    {
        this.salary=salary;
        this.working_hours=working_hours;
    }
   public void AddSal()
    {
        if(salary<500)
        {
            salary=salary+10;
        }
    }
    public void AddWork()
    {
        if(working_hours>6)
        {
            salary=salary+5;
        }
    }
    
    
}
//Do Not change the Below Main Method


public class Main {
    public static void main(String args[]) {
        Employee t=new Employee();
        t.getInfo(400,7);
        t.AddSal();
        t.AddWork();
        System.out.println(t.salary);
        Employee x=new Employee();
        x.getInfo(600,8);
        x.AddSal();
        x.AddWork();
        System.out.println(x.salary);

    }
}
//========== User's Code Ends Here ==========
