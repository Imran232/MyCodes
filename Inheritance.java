//========== User's Code Starts Here ==========
//Write the code Below
class Shape
    {
        public void printShape()
        {
            System.out.println("This is shape");
        }
    }
    class Rectangle extends Shape
    {
        public void print()
        {
            System.out.println("This is rectangle");
        }
    }
    class Circle extends Shape
    {
        public void print()
        {
            System.out.println("This is circle");
        }
    }
    class Square extends Rectangle
    {
        public void printSquare()
        {
            System.out.println("Square is rectangle");
        }
    }



//Do Not change the Below Main Method


public class Main {
    public static void main(String args[]) {
        Square x = new Square();
        x.printSquare();
        x.printShape();
        x.print();
        Circle y= new Circle();
        y.print();
        y.printShape();

    }
}
//========== User's Code Ends Here ==========
