import java.util.Scanner ; 

public class ProgrammingExercise4 {
public static void main(String[] args) {  
          
        String sentence, revisedSentence;    
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter sentence that you want translated:  ");
        sentence = input.nextLine();
    }

    revisedSentence = separateWords(sentence); 
    System.out.print("Translated Sentence: " +revisedSentence); 
    toPigLatin(revisedSentence);
}
private static String separateWords(String sentence) 
{    
    StringBuilder str = new StringBuilder(sentence); 
    int i = 1;      
    while (i < str.length())
    {        
        if(Character.isUpperCase(str.charAt(i)))
        {
            str.insert(i, ' '); 
            i++;
            char ch = Character.toLowerCase(str.charAt(i)); 
            str.setCharAt(i, ch);
        }
        i++; 
    }
    return str.toString();
}
private static void toPigLatin(String revisedSentence) 
{      
    String latin = " ";    
    String[] tokens = revisedSentence.split(" "); 

    for (String str : tokens) {
        String str1 = str.substring(0, 1);
        String str2 = str.substring(1, str.length());
        str2 = str2.concat(str1);
        str2 = str2.concat("ay");
        latin = latin.concat(str2 + " ");
       
    }     

       System.out.println("\nPig Latin Version: \r " + latin ); 
    }
}