/* 136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1 */

import java.util.HashSet;
import java.util.Set;

public class LeetCode_136_SingleNumber {

  public static int singleNumber(int[] nums) {
    Set<Integer> set = new HashSet<>();
    
    for (int num: nums){
        if(set.contains(num)){
            set.remove(num);
        } else {
            set.add(num);
        }
    }

    for (int num : set) {
      return num;
    }
  
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(singleNumber(new int[] { 2, 2, 1 }));
    System.out.println(singleNumber(new int[] { 4, 1, 2, 1, 2 }));
    System.out.println(singleNumber(new int[] { 1 }));
  }
}
