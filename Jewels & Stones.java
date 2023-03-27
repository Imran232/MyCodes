import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       HashMap<Character, Integer> sj = new HashMap<>();
        for(char ch : stones.toCharArray())
            sj.put(ch,sj.getOrDefault(ch,0)+1);
        int count=0;
        for(char ch : jewels.toCharArray())
            count+=sj.getOrDefault(ch,0);
        return count;
        
    }
}

//========== User's Code Ends Here ==========



/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String m=sc.nextLine();
        Solution s =new Solution();
        int max= s.numJewelsInStones(n,m);
        System.out.println(max);
    }
}