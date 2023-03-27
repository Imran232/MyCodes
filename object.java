//========== User's Code Starts Here ==========
class Employee
{
    //Write the code here
    String name;
    int year;
    String address;
    Employee(String a,int b,String c)
    {
        name=a;
        year=b;
        address=c;
    }
    public void print_details()
    {
        System.out.println(name+" "+year+" "+address);
    }
    
    
}
//Do Not change the Below Main Method


public class Main {
    public static void main(String args[]) {
        Employee t=new Employee("ram",1992,"Bangalore");
        t.print_details();
        
        Employee x=new Employee("shyam",2010,"Lucknow");
        x.print_details();
        
        Employee y=new Employee("babu_rao",2015,"Delhi");
        y.print_details();

    }
}
//========== User's Code Ends Here ==========
