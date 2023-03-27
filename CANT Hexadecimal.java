import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public String toHex(int num) {
        char[] map={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num==0)return "0";
        String result="";
        while(num!=0){
            result=map[(num&15)]+result;
            num=(num>>>4);
        }
        return result;
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
        String max= s.toHex(n);
        System.out.println(max);
    }
}