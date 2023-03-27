import java.io.*;
import java.util.*;
class Employee {
    String Name;
    int Salary;
    public Employee(int Salary, String Name)
    {
        this.Salary = Salary;
        this.Name = Name;

    }
    public String toString()
    {
        // Returning attributes of Student
        return this.Salary + " " + this.Name;
    }
}

class SortbySalary implements Comparator<Employee> {
    public int compare(Employee a, Employee b)
    {
 
        return b.Salary - a.Salary;
    }
}
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Employee> ar = new ArrayList<Employee>();
 
        ar.add(new Employee(15000, "Imran"));
        ar.add(new Employee(30000, "Ram"));
        ar.add(new Employee(13000, "Subham"));
        ar.add(new Employee(10500, "Masthan"));
        ar.add(new Employee(20000,  "Kamal"));

        Collections.sort(ar, new SortbySalary());

        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }

}