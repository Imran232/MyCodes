import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int[] element_search(int[] nums, int target) {
           int[] ans = {-1,-1};
        for(int i = 0; i < nums.length; i++){
           if(nums[i] == target){
               ans[0] = i;
                while(i<nums.length && nums[i] == target){
                    ans[1] = i;
                    i++;
               } 
               break;
           }
        }
        return ans;
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
        int output[] = s.element_search(arr,sc.nextInt());
        Arrays.sort(output);
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}