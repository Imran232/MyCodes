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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head=new ListNode(0);
        ListNode l3=dummy_head;
        int carry=0;
        while(l1!=null||l2!=null)
        {
          int l1_val=(l1!=null)?l1.val:0;
          int l2_val=(l2!=null)?l2.val:0;
          int curr_sum=l1_val+l2_val+carry;
          carry=curr_sum/10;
          int last_digit=curr_sum%10;
          ListNode new_node=new ListNode(last_digit);
          l3.next=new_node;
          if(l1!=null)l1=l1.next;
          if(l2!=null)l2=l2.next;
          l3=l3.next;
        }
        if(carry>0)
        {
          ListNode new_node=new ListNode(1);
          l3.next=new_node;
          l3=l3.next;
        }
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
        int m=sc.nextInt();
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
        
        
        ListNode output = s.addTwoNumbers(head,head1);
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