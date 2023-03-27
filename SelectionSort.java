//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int[] sort_array(int arr[],int length)
    {
        /*Function to sort the array in descending order
        After sorting return the sorted array */
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[min]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
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
