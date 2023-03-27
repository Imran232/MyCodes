import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> index=new LinkedList();
        List<Integer> result=new ArrayList();
      for(int i=0;i<nums.length;i++)
      {
        while(index.size()>0 && index.getFirst()<=i-k)
            index.removeFirst();
        while(index.size()>0 && nums[i]>=nums[index.getLast()])
            index.removeLast();
        index.addLast(i);
        if(i>=k-1)
        result.add(nums[index.getFirst()]);
      }
      return result.stream().mapToInt(x->x).toArray();
        
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
        int k=sc.nextInt();
        int[] output = s.maxSlidingWindow(arr,k);
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}