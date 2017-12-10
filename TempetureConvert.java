 import java.util.Scanner ; 
        
public class TempetureConvert {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature in Fahrenheit") ;
        double fahrenheit = input.nextDouble();
        double convertTemp = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +  convertTemp + " in Celsius");        
        System.out.print ("Please enter a temperature in Celsius");
        double celsius = input.nextDouble();
        double tempConvert = (celsius * 9.0/5.0) + 32 ;
        System.out.println("Celsius " + celsius + " is " + tempConvert + " in Fahrenheit ");                
    }
}