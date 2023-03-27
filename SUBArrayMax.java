//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int find_maximum_subarray(int arr[],int length)
    {
       /*write the code to find the maximum subarray sum
        only return the maximum sum of the subarray . 
        Both array and size of array is given */
          int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
                if(sum>max)
                {
                    max=sum;
                }
            }
            
        }
         return max;
       
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
        int max= find_maximum_subarray(arr,n);
        System.out.println(max);
    }
}
//========== User's Code Ends Here ==========
