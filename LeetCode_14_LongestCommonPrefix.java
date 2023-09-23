/* 
14. Longest Common Prefix 

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""

Explanation: There is no common prefix among the input strings.

*/

import java.util.Arrays;

public class LeetCode_14_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length -1];
        int idx = 0;  
        while (idx < str1.length() && idx < str2.length()){
            if(str1.charAt(idx) == str2.charAt(idx)){
                idx++;
            }else{
                break;
            }
        }    
        return str1.substring(0, idx);
    }

     public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println("Output for strs1: " + longestCommonPrefix(strs1)); // Output: "fl"
        System.out.println("Output for strs2: " + longestCommonPrefix(strs2)); // Output: ""
        System.out.println("Output for strs3: " + longestCommonPrefix(new String[] {"dog", "racecar", "dort"}));
    }

}
