import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int search(int[] nums, int target) {
          int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(target==nums[mid])
            return mid;
            if(target<nums[mid])
            high=mid-1;
            else
            low=mid+1;
        }
        return -1;
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
        int output = s.search(arr,sc.nextInt());
        
        System.out.println(output);
    }
} 
