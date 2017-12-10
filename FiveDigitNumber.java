 import java.util.Scanner ; 

public class FiveDigitNumber {
    public static void main(String[]args){
        int n; 
        Scanner input = new Scanner (System.in) ;
        System.out.print ("Please enter a five digit number");
        n = input.nextInt(); 
         FiveDigitNumber obj = new FiveDigitNumber();
        int a = obj.add(n);
        System.out.println("Sum of the digits of " + n + " is "+a);
    }
    private int sum;
    int add(int n)
    {
        sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return sum + add(n / 10);        
        }
    }
}