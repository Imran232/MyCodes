import java.util.*;


//========== User's Code Starts Here ==========

class MyStack {
 Queue<Integer> queue = new LinkedList<>();
    public MyStack() {    
    }
    public void push(int x) {
        queue.add(x);
        for(int i = 0 ; i < queue.size() - 1 ; i++){
            queue.add(queue.remove());
        }
    }
    public int pop() {
        return queue.remove();
    }
    public int top() {
        return queue.peek();
    }
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        MyStack stack =new MyStack();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            String operation=sc.nextLine();
            if(operation.equals("stop"))
            {
                break;
            }
            else if(operation.equals("push"))
            {
                stack.push(Integer.parseInt(sc.nextLine()));
                System.out.println("null");
            }
            else if (operation.equals("pop"))
            {
                int x = stack.pop();
                System.out.println(x);
            }
            else if (operation.equals("top"))
            {
                int x=stack.top();
                System.out.println(x);
            }
            else if(operation.equals("empty"))
            {
                boolean x=stack.empty();
                System.out.println(x);
            }
            
        }
    }
}