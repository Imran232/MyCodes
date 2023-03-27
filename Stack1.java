import java.util.*;


//========== User's Code Starts Here ==========
class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

//========== User's Code Ends Here ==========



/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class Main
{
   
    
     public static void main(String[]args)
    {
        MinStack stack =new MinStack();
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
                stack.pop();
                System.out.println("null");
            }
            else if (operation.equals("top"))
            {
                int x=stack.top();
                System.out.println(x);
            }
            else if(operation.equals("min"))
            {
                int x=stack.getMin();
                System.out.println(x);
            }
            
        }
    }
}