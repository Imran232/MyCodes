import java.util.*;


//========== User's Code Starts Here ==========

//Make sure the class is not public because there can be only one class that can
//be public in a module(Main class)
class Solution {
    public int countPrimes(int n) {
           int count = 0;
        if(n <= 2)
        {
            return count;
        }
        boolean[] Prime = new boolean[n+1];
        Arrays.fill(Prime, true);
        for(int i = 2; i*i <= n; i++)
        {
            if(Prime[i])
            {
                for(int j = 2*i; j <= n; j += i){
                    Prime[j] = false;
                }
            }
        }
        for(int i = 2; i < n; i++)
        {
            if(Prime[i])
            {
                count++;  
            }
        }
        return count;
        
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s =new Solution();
        int max= s.countPrimes(n);
        System.out.println(max);
    }
}