import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int trap(int[] height) {
          int n=height.length;
        Stack<Integer> st=new Stack<>();
        int curr=0,w=0;
        while(curr<n){
            while(!st.isEmpty() && height[curr]>height[st.peek()])
            {
                int top=st.pop();
                if(st.isEmpty()) break;
                int d=curr-st.peek()-1;
                int fill=d*(Math.min(height[curr],height[st.peek()])-height[top]);
                w+=fill;
            }
            st.push(curr++);
        }
        return w;
        
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        Solution s = new Solution();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int max= s.trap(arr);
        System.out.println(max);
    }
}