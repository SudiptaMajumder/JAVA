/* 
Given two sorted arrays nums1 and nums2 of size m and n respectively, 
return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5. 
*/

public class LeetCode_4_Median_ofTwoSortedArrays {
    static double findMedianSortedArrays(int[] num1, int[] num2) {
        int length =  num1.length+ num2.length;
        int[] mergedArray = new int[length];
       
        int i=0,j=0,n=0;
        while(i < num1.length && j < num2.length ){
            if(num1[i] <= num2[j]){
                mergedArray[n++] = num1[i++];
            }else{
                mergedArray[n++] = num2[j++];
            }
        }

        while(i<num1.length){
            mergedArray[n++] = num1[i++];
        }

        while(j<num2.length){
            mergedArray[n++] = num2[j++];
        }

        int mlength = mergedArray.length;
        if(mlength%2==0){
            double median = mergedArray[mlength/2] + mergedArray[mlength/2 -1];
            return median/2;
        }else{
            return mergedArray[mlength/2];
        }
    }

    public static void main (String[] args){
        System.out.println(findMedianSortedArrays(new int[] {1,3}, new int[] {2}));
        System.out.println(findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}));
    }
}
