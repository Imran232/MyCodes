import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0;
        Stack<Integer> st=new Stack<Integer>();
        for(int x:pushed)
        {
            st.push(x);
            while(st.size()>0 && st.peek()==popped[j])
            {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
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
        n =sc.nextInt();
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
        boolean max= s.validateStackSequences(arr,arr2);
        System.out.println(max);
    }
}