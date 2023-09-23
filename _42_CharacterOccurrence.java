/*  
 Find the occurrence of the first and last occurrence of an element using recursion.
*/

public class _42_CharacterOccurrence {

  public static int first = -1;
  public static int last = -1;

  public static void main(String[] args) {
    String str = "piash Majumder";
    char e1 = 'a';
    getIndex(str, e1, 0);
    System.out.println("First occurence : " + first);
    System.out.println("Last occurence : " + last);
  }

  public static void getIndex(String str, char character, int indx) {

    if (indx == str.length()) {
      return;
    }

    if (str.charAt(indx) == character) {
      if (first == -1) {
        first = indx;
      } else {
        last = indx;
      }
    }

    getIndex(str, character, indx + 1);
  }


}
