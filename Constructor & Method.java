//========== User's Code Starts Here ==========
class Triangle
{
    //Write the code here
    int side1,side2,side3;
    Triangle(int x,int y, int z)
    {
        side1=x;
        side2=y;
        side3=z;
    }
    public int calculate_area()
    {
        int area=(side1*side2*side3);
        return area;
    }
    public int calculate_perimeter()
    {
        int per=(side1+side2+side3);
        return per;
    }
    
}
//Do Not change the Below Main Method


public class Main {
    public static void main(String args[]) {
      Triangle t=new Triangle(3,4,5);
      System.out.println(t.calculate_area());
      int per=t.calculate_perimeter();
      System.out.println(per);
      t=new Triangle(9,10,11);
      System.out.println(t.calculate_area());
      per=t.calculate_perimeter();
      System.out.println(per);
    }
}
//========== User's Code Ends Here ==========
