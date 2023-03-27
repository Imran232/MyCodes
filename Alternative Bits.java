import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int a=(n&1);
            n>>=1;
            int b=(n&1);
            if(a==b)
            return false;
        }
        return true;
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
        boolean max= s.hasAlternatingBits(n);
        System.out.println(max);
    }
}