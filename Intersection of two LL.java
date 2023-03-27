import java.util.*;


//========== User's Code Starts Here ==========

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode a_runner=headA;
        ListNode b_runner=headB;
        while(a_runner!=b_runner)
        {
          if(a_runner==null)
          {
            a_runner=headB;
          }else{
            a_runner=a_runner.next;
          }
          if(b_runner==null)
          {
            b_runner=headA;
          }else{
            b_runner=b_runner.next;  
          }
        }
        return a_runner;
    }
}

//========== User's Code Ends Here ==========



public class Main
{
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        Solution s = new Solution();
        ListNode head =new ListNode(sc.nextInt());
        ListNode temp=head;
        for(int i=1;i<n;i++)
        {
            ListNode new_node=new ListNode(sc.nextInt());
            temp.next=new_node;
            temp=new_node;
        }
        ListNode head1 =new ListNode(sc.nextInt());
        ListNode temp1=head1;
        for(int i=1;i<m;i++)
        {
            ListNode new_node=new ListNode(sc.nextInt());
            temp1.next=new_node;
            temp1=new_node;
        }
        ListNode head2 =new ListNode(sc.nextInt());
        ListNode temp2=head2;
        for(int i=1;i<x;i++)
        {
            ListNode new_node=new ListNode(sc.nextInt());
            temp2.next=new_node;
            temp2=new_node;
        }
        temp.next=head2;
        temp1.next=head2;
        
        ListNode output = s.getIntersectionNode(head,head1);
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