//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_subarray(int arr[],int length)
    {
       /*Function to print all the subarrays given in an array
        Input arr--> array, length -->length of an array */
        //int arr[]=new int[n];
        /*for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
        */
        int i=0;
        while(i<arr.length)
        {
            int j=i;
            while(j<arr.length)
            {
                
            int k=i;
            while(k<=j)
            {
                System.out.print(arr[k]);
                k=k+1;
                
            }
            System.out.println();
            j=j+1;
            
            }
            i=i+1;
        }
       
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
        print_subarray(arr,n);
        
    }
}
//========== User's Code Ends Here ==========
