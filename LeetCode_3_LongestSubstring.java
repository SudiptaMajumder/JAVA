/* 
3. Longest Substring Without Repeating Characters 

Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

import java.util.HashSet;


public class LeetCode_3_LongestSubstring {

  /*  static int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int maxLength = 0;
    int i = 0, j = 0;
    HashSet<Character> set = new HashSet<>();

    while (i < n && j < n) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        maxLength = Math.max(maxLength, j - i);
      } else {
        set.remove(s.charAt(i++));
      }
    }
    return maxLength;
  } */

  static int lengthOfLongestSubstring(String s) {
    // Base condition
    if (s == null || s.equals("")) {
      return 0;
    }
    // Starting window index
    int start = 0;
    // Ending window index
    int end = 0;
    // Maximum length of substring
    int maxLength = 0;
    // This set will store the unique characters
    HashSet<Character> uniqueCharacters = new HashSet<>();
    // Loop for each character in the string
    while (end < s.length()) {
     if (uniqueCharacters.add(s.charAt(end))) {
        end++;
        maxLength = Math.max(maxLength, uniqueCharacters.size());
      } else {
        uniqueCharacters.remove(s.charAt(start));
        start++;
      } 
    }
    return maxLength;
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcdbcbbaxyi"));
    System.out.println(lengthOfLongestSubstring("bbbbb"));
    System.out.println(lengthOfLongestSubstring("pwwkew"));
    System.out.println(lengthOfLongestSubstring("piash"));
  }
}
