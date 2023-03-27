import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> newIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (newIndex.containsKey(target - nums[i])) {
                return new int[] {newIndex.get(target - nums[i]), i};
            }
            newIndex.put(nums[i], i);
        }
        return new int[] {};
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
        int output[] = s.twoSum(arr,sc.nextInt());
        
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}