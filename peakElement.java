import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = 0;
        if (nums.length == 1) {
            return 0;
        }
        while (j < nums.length) {
            if (j < nums.length) {
                j++;
            }
            if (j < nums.length && nums[i] > nums[j]) {
                return i;
            } else if (nums[j] > nums[i] && j == nums.length - 1) {
                return j;
            }
            i++;
        }
        return 0;
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
        int output = s.findPeakElement(arr);
        
        System.out.println(output);
    }
}