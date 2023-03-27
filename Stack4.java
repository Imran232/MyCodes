import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(st.isEmpty()){
            st.push(curr);
                }
            
            else if(st.peek() == curr){
                st.pop();
            }else{
                st.push(curr);
            }
        }
        String n = "";
        while(!st.isEmpty()){
            n =st.pop()+ n  ;
        }
        return n;
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
        String max= s.removeDuplicates(n);
        System.out.println(max);
    }
}