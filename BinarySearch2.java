import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int i = 0;
        int j = len-1;
        while(i<=j)
        {
            int mid = (i + j) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[i] <= nums[mid]) // checking whether first half is in sorted order or not
            {
                if(target < nums[mid] && target >= nums[i]) //if the element is in first half then we will discard second half
                    j = mid - 1;
                else
                    i = mid + 1;
            }
            else
            {
                    if(target > nums[mid] && target <= nums[j])
                        i = mid + 1;
                    else
                        j = mid - 1;
            }
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