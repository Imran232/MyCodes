import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=-1;
        for(int i=0;i<sentences.length;i++)
        {
            String arr[]=sentences[i].split(" ");
            if(arr.length>max)
            max=arr.length;
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
        int n =Integer.parseInt(sc.nextLine());
        Solution s = new Solution();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        int output = s.mostWordsFound(arr);
        
        System.out.println(output);
    }
}