import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<=n;i++)
        {
            int currHeight=i==n?0:heights[i];
            while(!s.isEmpty()&&currHeight<heights[s.peek()])
            {
                int top=s.pop();
                int width=s.isEmpty()?i:i-s.peek()-1;
                int area=heights[top]*width;
                maxArea=Math.max(area,maxArea);
            }
            s.push(i);
        }
        return maxArea;
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
        
        int max= s.largestRectangleArea(arr);
        System.out.println(max);
    }
}