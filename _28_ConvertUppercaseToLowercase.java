/**
Java program to convert string to lowercase

 Input
    Input string: I love CODEFORWIN.
Output
    Lowercase string: i love codeforwin.

 */

import java.util.Scanner; 
public class _28_ConvertUppercaseToLowercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        String str = sc.nextLine();

        String lowercaseStr = str.toLowerCase();
        System.out.println("Lowercase String(with using toLowerCase method): "+ lowercaseStr);
        //OR

        char[] chArray = str.toCharArray();
        for(int i =0; i<chArray.length; i++){
            if(chArray[i]>='A' && chArray[i]<='Z'){
                chArray[i] = (char)(chArray[i] + 32);
            }
        }
        String lowerCase = new String(chArray);
        System.out.println("Lowercase String: "+ lowerCase); 
        
        sc.close();
    }
}
