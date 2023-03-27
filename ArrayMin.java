//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int find_minimum(int arr[],int length)
    {
       /*Function to find the minimum in the array 
          return the minimum value*/
           int i;
          int min=arr[0];
          for(i=1;i<arr.length;i++)
          if(arr[i]<min)
          min=arr[i];
          return min;

       
        /* Do not change the code beyond this point*/
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min= find_minimum(arr,n);
        System.out.println(min);
    }
}
//========== User's Code Ends Here ==========
