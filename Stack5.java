import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public String decodeString(String s) {
        Stack<Integer>numStack=new Stack<>();
        Stack<StringBuilder>strBuild=new Stack<>();
        StringBuilder str = new StringBuilder();
        int num=0;
        for(char c:s.toCharArray())
        {
            if(c>='0' && c<='9')
            {
                num=num*10 +c -'0';
            }
            else if(c=='[')
            {
                strBuild.push(str);
                str=new StringBuilder();
                numStack.push(num);
                num=0;
            }
            else if(c==']')
            {
                StringBuilder temp=str;
                str=strBuild.pop();
                int count=numStack.pop();
                while(count-->0)
                {
                    str.append(temp);
                }
            }
            else
            {
                str.append(c);
            }
        }
        return str.toString();
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
        String max= s.decodeString(n);
        System.out.println(max);
    }
}