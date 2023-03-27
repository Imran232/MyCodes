class Solution {
    public ListNode removeElements(ListNode head, int val) {
          while(head!=null && head.val==val)
      {
        head=head.next;
      }
      ListNode current_n=head;
      while(current_n!=null && current_n.next!=null)
      {
        if(current_n.next.val==val)
        {
          current_n.next=current_n.next.next;
        }else{
          current_n=current_n.next;
        }
      }
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
        ListNode output = s.removeElements(head,k);
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