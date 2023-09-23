/*  
Print all the subsequences of a string. 
 
*/

public class _45_AllSubsequence {

  public static void printSubseq(String str, int idx, String res) {
    if (idx == str.length()) {
      System.out.println(res);
      return;
    }
    //choose
    printSubseq(str, idx + 1, res + str.charAt(idx));
    //don't choose
    printSubseq(str, idx + 1, res);
  }

  public static void main(String args[]) {
    String str1 = "abc";
    printSubseq(str1, 0, "");
  }
}
