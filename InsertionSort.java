//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int[] sort_array(int arr[],int length)
    {
        /*Function to sort the array in ascending order
        After sorting return the sorted array */
        int n=arr.length;
        for(int j=1;j<n;j++){
            int k=arr[j];
            int i=j-1;
            while((i>-1)&&(arr[i]>k)){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=k;
        }
        return arr;
        /* Dont change anything below. If changed click on reset. */
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] output = sort_array(arr, n);
        for(int i=0;i<n;i++)
            System.out.println(output[i]);
    }
}
//========== User's Code Ends Here ==========
