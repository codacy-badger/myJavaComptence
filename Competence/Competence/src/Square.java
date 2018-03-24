
import java.util.*;
class Square
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 
        System.out.printf("Enter i Value:  ");
        int i = in.nextInt();
        findSquareRoot(i);
    }
    public static void findSquareRoot(double number)
    {
        boolean isPositiveNumber = true;
        double g1;
        double squareRoot = number/2;
        do
        {
            g1=squareRoot;
            squareRoot= (g1 + (number/g1))/2;
        }
        while((g1-squareRoot)!=0);
 
        if(isPositiveNumber)
        {
            System.out.println("the Square root of "+number+" is ");
            System.out.println(squareRoot);
        }
        else
        {
            System.out.println("+"+squareRoot+" i");
        }
    }
}