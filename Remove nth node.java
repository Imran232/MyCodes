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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head=new ListNode(0);
        dummy_head.next=head;
        ListNode slow=dummy_head,fast=dummy_head;
        for(int i=1;i<=n+1;i++)
        {
          fast=fast.next;
        }
        while(fast!=null)
        {
          slow=slow.next;
          fast=fast.next;
        }
        slow.next=slow.next.next;
      return dummy_head.next;
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
        ListNode output = s.removeNthFromEnd(head,k);
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
}