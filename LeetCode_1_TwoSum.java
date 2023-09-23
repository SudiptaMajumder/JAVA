/* 1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that 
they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1] 
*/

public class LeetCode_1_TwoSum {

  static int[] twosum(int[] nums, int target) {
    int[] newarray = new int[2];

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          newarray[0] = i;
          newarray[1] = j;
          return newarray;
        }
      }
    }

    return null;
  }

  public static void main(String[] args) {
    printarray(twosum(new int[] { 2,7,11,15 }, 9));
    printarray(twosum(new int[] { 3,2,4 }, 6));
    printarray(twosum(new int[] { 3,3 }, 6));
  }

  static void printarray(int[] arr) {
    if (arr == null) {
      System.out.println("null");
    } else {
      System.out.print("{");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
          System.out.print(",");
        }
      }
      System.out.println("}");
    }
  }
}
