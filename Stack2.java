import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
                st.push(')');
            else if(c=='{')
                st.push('}');
            else if(c=='[')
                st.push(']');
            else if(st.isEmpty() || st.pop()!=c)
            return false;
        }
        return st.isEmpty();
        
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
        Solution s =new Solution();
        boolean max= s.isValid(n);
        System.out.println(max);
    }
}