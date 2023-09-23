/* Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python. 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, \
2 is returned. */

public class LeetCode_69_Sqrtx {

 /*  public static int mySqrt(int x) {
    int i = 1, result = 1;
    while (result <= x) {
      i++;
      result = i * i;
    }
    return i - 1;
  } */
  //The idea is to find the largest integer i whose square is less than or equal to the given number. 
  //The values of i * i is monotonically increasing, so the problem can be solved using binary search.

  public static int mySqrt(int x) {
     if (x == 0) {
        return 0;
    }
    
    int left = 1;
    int right = x;
    int result = 0;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (mid <= x / mid) {
            left = mid + 1;
            result = mid;
        } else {
            right = mid - 1;
        }
    }
    
    return result;
  }


  public static void main(String[] args) {
    System.out.println(mySqrt(4));
    System.out.println(mySqrt(8));
    System.out.println(mySqrt(1));
    System.out.println(mySqrt(0));
    System.out.println(mySqrt(2147395599));
   
  }
}
