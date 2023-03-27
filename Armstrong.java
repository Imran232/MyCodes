import java.util.*;
public class ArmStrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int oc,d,ac=0;
        oc=n;
        while(n!=0)
        {
            d=n%10;
            ac=ac+(d*d*d);
            n=n/10;
        }
        if(ac==oc)
        {
            System.out.println("True");
        }
            else
            {
            System.out.println("False");
        }

    }
    
}
