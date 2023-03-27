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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null)
        {
          ListNode next_node=head.next;
          head.next=prev;
          prev=head;
          head=next_node;
        }
        return prev;
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
        ListNode output = s.reverseList(head);
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