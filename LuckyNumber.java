import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int findLucky(int[] arr) {
       /* int[] count = new int[501];
        for (int n : arr) {
            count[n]++;
        }
        int max = -1;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == i) max = i;
        }
        return max;*/
         Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int max = -1;

        for (int n : map.keySet()) {
            if (n == map.get(n)) {
                max = Math.max(max, n);
            }
        }

        return max;
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
        
        int max= s.findLucky(arr);
        System.out.println(max);
    }
}