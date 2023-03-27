import java.util.*;


//========== User's Code Starts Here ==========

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0)
        return head;
        int length=0;
        ListNode tail=head;
        while(tail.next!=null)
        {
          length++;
          tail=tail.next;
        }
        length++;
        tail.next=head;
        int rotatePoint=length-k%length;
        tail=head;
        while(rotatePoint-->1)
        {
          tail=tail.next;
        }
        head=tail.next;
        tail.next=null;
        return head;
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
        ListNode head =new ListNode(sc.nextInt());
        ListNode temp=head;
        for(int i=1;i<n;i++)
        {
            ListNode new_node=new ListNode(sc.nextInt());
            temp.next=new_node;
            temp=new_node;
        }
        int k=sc.nextInt();
        ListNode output = s.rotateRight(head,k);
        String str="";
        while(output!=null)
        {
            str=str+output.val+" ";
            output=output.next;
        }
        System.out.println(str);
    }
}
class ListNode
{
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) 
     { 
         this.val = val; 
         next=null;
         
     }
}888