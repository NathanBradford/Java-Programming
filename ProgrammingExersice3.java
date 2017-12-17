import java.util.Scanner ;

public class ProgrammingExersice3 {
    public static void main(String[]args) {
        int number = (int) (Math.random()*10000) ;
       System.out.print ("Try to guess the number between 1 and 10000"); 
       Scanner input = new Scanner(System.in);
       int guess = -1;
       while (guess != number) {
           System.out.print("\nPlease Eenter Your Guess: ");           
           
           guess = input.nextInt();
          if (guess == number)
               System.out.println("Congratulation! You correctly guessed " + number);
          else if (guess > number)
                   System.out.println("Lower");                  
                     else
                   System.out.println("Higher");
       
         }
    }
}
