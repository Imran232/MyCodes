import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int divide(int dividend, int divisor) {
        int i,j;
        int max=Integer.MAX_VALUE, min=Integer.MIN_VALUE;
        if((divisor<0 && dividend>0)||(divisor>0 && dividend<0))
        {
            j=dividend/divisor;
            return j;
        }
        if(divisor>0 && dividend>0)
        {
            j=dividend/divisor;
            return j;
        }
        if(divisor<0 && dividend<0)
        {
            j=dividend/divisor;
            if(j==min)
            return max;
            else
            return j;
        }
        return 0;
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
        int d = sc.nextInt();
        int max= s.divide(n,d);
        System.out.println(max);
    }
}