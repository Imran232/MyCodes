import java.util.*;


//========== User's Code Starts Here ==========

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 **/
 class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
          slow=slow.next;
          fast=fast.next.next;
          if(slow==fast)
          {
            slow=head;
            while(slow!=fast)
            {
              slow=slow.next;
              fast=fast.next;
            }
            return slow;
          }
        }
      return null;
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
        if(k!=0)
    {
        ListNode temp2=head;
        while(k!=0)
        {
            temp2=temp2.next;
            k=k-1;
        }
        temp.next=temp2;
    }
     ListNode output = s.detectCycle(head);
    if(output!=null)
    {
        System.out.println(output.val);
    }
    else
    System.out.println(-1);
        
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