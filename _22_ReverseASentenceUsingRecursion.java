/**
 Java program to Reverse a Sentence Using Recursion

  Input
sudipta

  Output
atpidus
 */
import java.util.Scanner;
public class _22_ReverseASentenceUsingRecursion {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String sentence = sc.nextLine();

        //logic - Without Using Recursion
        int length1 = sentence.length();
        int n=length1;
        char[] reverseString = new char[length1+1];
        for (int i =0; i<length1 ; i++){
            reverseString[i] = sentence.charAt(n-1);
            n--;
        }
        String result = new String(reverseString);
        System.out.println("Reverse String is: "+ result);

        //another logic - With Recursion
        System.out.print("Reverse String is (Recursion Method): ");
        reverseString(sentence);
        sc.close();
    }

    //Recursion
    static void reverseString(String sentence){
        if(sentence == ""){
            return;
        }
        reverseString(sentence.substring(1));
        System.out.print(sentence.charAt(0)); 
    }
}
