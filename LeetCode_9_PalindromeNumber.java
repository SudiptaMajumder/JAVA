/* 9. Palindrome Number
Given an integer x, return true if x is a 
palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 */
public class LeetCode_9_PalindromeNumber {

  static boolean isPalindrome(int x) {
    int Original = x;
    int reverseNumber = 0;

    while (x>0) {
      reverseNumber = reverseNumber * 10;
      reverseNumber = (x % 10) + reverseNumber;
      x = x / 10;
    }
    if (Original == reverseNumber) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(-121));
    System.out.println(isPalindrome(10));
  }
}
