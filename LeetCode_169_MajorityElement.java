/* 169. Majority Element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2 */


public class LeetCode_169_MajorityElement {

    public static int majorityElement(int[] nums) {
         int n =nums.length;
         int maxNum = nums[0];
         int count =1;
         for(int i =0;i<n; i++){
            if(nums[i]==maxNum){
                count++;
            }
            else{
                count--;
                if(count==0){
                    maxNum = nums[i];
                    count++;
                }
            }
         }
         return maxNum;
    }
    public static void main (String[] args){
        System.out.println(majorityElement(new int[] { 3,2,3 }));
        System.out.println(majorityElement(new int[] { 2,2,1,1,1,2,2 }));
    }
}
