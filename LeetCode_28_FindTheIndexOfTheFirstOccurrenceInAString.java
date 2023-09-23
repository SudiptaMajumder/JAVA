/* 28. Find the Index of the First Occurrence in a String 

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

*/

public class LeetCode_28_FindTheIndexOfTheFirstOccurrenceInAString {
  public static int strStr(String haystack, String needle) {
    int haystackln = haystack.length();
    int needleln = needle.length();
    
    if(haystackln < needleln){
        return -1;
    }
    for(int i = 0; i<= haystackln -needleln ; i++){
        if(haystack.substring(i, i+needleln).equals(needle)){
            return i;
        }
    }
    return -1;
  }

  public static void main (String[] args){
    System.out.println(strStr("sadbutsad","sad"));
    System.out.println(strStr("leetcode","leeto"));
    System.out.println(strStr("a","a"));
    System.out.println(strStr("butsad","ad"));
  }
}
