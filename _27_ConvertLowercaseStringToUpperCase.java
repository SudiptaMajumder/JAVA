/**
 Java program to convert string to uppercase

    Input
Input string: I love Codeforwin.
    Output
I LOVE CODEFORWIN.

 */

import java.util.Scanner;
public class _27_ConvertLowercaseStringToUpperCase {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        String str = sc.nextLine();

        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase (with using toUppercase method): " + upperCaseStr);
        //OR

        char[] characterArray = str.toCharArray();
        for(int i =0; i<characterArray.length; i++){
            if(characterArray[i]>='a' && characterArray[i]<='z' ){
                characterArray[i] = (char) (characterArray[i]-32);
            }
        }
        String upperCase = new String(characterArray);
        System.out.println("Uppercase:" + upperCase);

        sc.close();

    }
}
