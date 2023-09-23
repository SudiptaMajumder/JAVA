/*  Input a string from the user. Create a new string called ‘result’ in which you will
replace the letter ‘e’ in the original string with letter ‘i’.
Example :
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz” 
*/

import java.util.*;

public class _37_replaceCharacter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("input String =");
    String str = sc.next();

    String result = "";

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        result += 'i';
      } else {
        result += str.charAt(i);
      }
    }
    System.out.println("result = " + result);
    sc.close();


    StringBuilder sb = new StringBuilder("Tony");

    //Get A Character from Index
    System.out.println(sb.charAt(0));

    //Set a Character at Index
    sb.setCharAt(0, 'P');
    System.out.println(sb);
    
    //Delete char at some Index
    sb.delete(0, 2);
    System.out.println(sb);

    //Insert a Character at Some Index
    StringBuilder sb1 = new StringBuilder("Piash");
    sb1.insert(2, 'S');
    System.out.println(sb1);

    //Append a char - Append means to add something at the end
    StringBuilder sb3 = new StringBuilder("Tony");
    sb3.append(" Stark");
    System.out.println(sb3);
  }
}
