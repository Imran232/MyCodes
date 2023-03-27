import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int[] sortByBits(int[] arr) {
     int n = arr.length, res[] = new int[n];
	for (int i = 0; i < n; i++) {
		res[i] = countBitOne(arr[i])*10001 + arr[i];
	}

	Arrays.sort(res);
	for (int i = 0; i < n; i++) {
		res[i] %= 10001;
	}

	return res;
}

private int countBitOne(int n) {
	int res = 0;
	while (n != 0) {
		res += (n & 1);
		n >>= 1;
	}
	return res;
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
        int[] output = s.sortByBits(arr);
        for(int i=0;i<n;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}