//========== User's Code Starts Here ==========
import java.util.*;
class Employee
{
    String name;
    int salary;
    Employee(String name,int salary)
    {
        this.name=name;
        this.salary =salary;
    }
}
//do Not change the above code
class Solution
{
   
    public static Employee[] sort_array(Employee arr[],int length)
    {
        /*Function to sort the array in ascending order
        After sorting return the sorted array */
        /*for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j].salary>arr[j+1].salary)
                {
                    Employee temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                }
            }
        }
        return arr;*/
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j].salary<arr[min].salary)
                {
                    min=j;
                }
            }
            Employee temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
        /* Dont change anything below. If changed click on reset. */
        
    
    }
}
public class Main
{
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Solution s= new Solution();
        int n =Integer.parseInt(sc.nextLine());
        Employee arr[]=new Employee [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Employee(sc.nextLine(),Integer.parseInt(sc.nextLine()));
        }
        Employee[] output = s.sort_array(arr, n);
        for(int i=0;i<n;i++)
            System.out.println(output[i].name+" "+output[i].salary);
    }
}
//========== User's Code Ends Here ==========
