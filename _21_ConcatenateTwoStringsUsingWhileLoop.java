/**
 Java program to concatenate two strings

  Input
Input string1: I love
Input string2: Code

  Output
Concatenated string: I love Code

 */
import java.util.Scanner;
public class _21_ConcatenateTwoStringsUsingWhileLoop {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input String 1 : ");
        String string1 = sc.nextLine();
        
        System.out.print("input String 2: ");
        String string2= sc.nextLine();

        /* 
        String concatenate= string1 + " " + string2;
        System.out.print("Concatenated string: " + concatenate); 
        */

        //anothe logic with using stringbuilder function.
        StringBuilder sb  = new StringBuilder();
        sb.append(string1);
        sb.append(" ");
        sb.append(string2);
        System.out.print("Concatenated string: " +sb );
        System.out.println();
        

        
        //another logic with using array function.
        // Calculate the lengths of the input strings
        int length1 = string1.length();
        int length2 = string2.length();

        // Create a character array with enough space for the concatenated string
        char[] concatenatedArray = new char[length1 + length2 + 1];

        // Copy characters from string1 to the concatenated array
        for (int i = 0; i < length1; i++) {
            concatenatedArray[i] = string1.charAt(i);
        }

        // Add a space character at the end of the copied characters
        concatenatedArray[length1] = ' ';

        // Copy characters from string2 to the concatenated array
        for (int i = 0; i < length2; i++) {
            concatenatedArray[length1 + 1 + i] = string2.charAt(i);
        }

        // Create a new string from the concatenated array
        String concatenatedString = new String(concatenatedArray);
        System.out.println("Concatenated string: " + concatenatedString);
       
        sc.close();
    }
}
