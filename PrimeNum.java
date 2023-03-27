//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int[] prime_numbers(int n)
    {
        /* Function to store first n prime_numbers in an array
            Return the array containing the prime numbers*/
            int b=2;
            int counter=0;
            int a[]=new int[n];
            while(counter<n)
            {
                 boolean flag=true;
                for(int i=2;i<b;i++)
                {
                    if(b%i==0)
                    {
                        flag=false;
                        break;
                    }
                    
                }
                if(flag==true)
                {
                    a[counter]=b;
                    counter=counter+1;
                }
                b=b+1;
            }
              return a;
 
        /* Dont change anything below. If changed click on reset. */
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        int[] output = prime_numbers(n);
        for(int i=0;i<n;i++)
            System.out.println(output[i]);
    }
}
//========== User's Code Ends Here ==========
