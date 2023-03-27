import java.util.*;


//========== User's Code Starts Here ==========
class StockSpanner {
    Stack<SharePrice> priceStack;
    int day=0;
    
    public StockSpanner() {
      priceStack=new Stack<>();
    }
    
    public int next(int price) {
        day++;
       SharePrice sp=new SharePrice(day,price);
        
        while(!priceStack.isEmpty() && priceStack.peek().getPrice()<=price){
            priceStack.pop();
        }
        if(priceStack.isEmpty()){
            priceStack.push(sp);
            return day;
        }
        int res=priceStack.peek().getDay();
        priceStack.push(sp);
        return day-res;
    }
}

class SharePrice{
    int day;
    int price;
    
    SharePrice(int day,int price){
        this.day=day;
        this.price=price;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getPrice(){
        return price;
    }
}



/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

//========== User's Code Ends Here ==========



public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        StockSpanner s = new StockSpanner();
        for(int i=0;i<n;i++)
        {
            int value = s.next(sc.nextInt());
            System.out.println(value);
        }
        
        
    }
}