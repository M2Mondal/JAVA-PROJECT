import java.io.*;
import java.util.*;
 
class Add {
     
    
    static int sumOfDigitsFrom1ToN(int n)
    {
        int result = 0; 
        for (int x = 1; x <= n; x++)
            result += sumOfDigits(x);
      
        return result;
    }
      
    static int sumOfDigits(int x)
    {
        int sum = 0;
        while (x != 0)
        {
            sum += x % 10;
            x   = x / 10;
        }
        return sum;
    }
      
    public static void main(String args[])
    {   
        System.out.println("Enter the no:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of digits in numbers"
                          +" from 1 to " + n + " is "
                          + sumOfDigitsFrom1ToN(n));
    }
}