/* 
Write a function that takes an array of integers as an argument and returns a value based on the sums
of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array and let Y = the
sum of the even numbers. The function should return X - Y

The signature of the function is:
int f(int[ ] a)

Examples
if input array is return
{1}                 1
{1, 2}              -1
{1, 2, 3}           2
{1, 2, 3, 4}        -2
{3, 3, 4, 4}        -2
{3, 2, 3, 4}        0
{4, 1, 2, 3}        -2
{1, 1}               2
{}                  0 
*/

public class _2_OddMinusEvenInArray{
    
    static int a1(int[] a){
        int sumOdd= 0;
        int sumEven = 0;
        for(int i = 0; i< a.length ; i++){
            if(a[i]%2 == 0){
                sumEven += a[i];
            }else { //if (a[i]%2 != 0){
                sumOdd += a[i];
            }
        }

        return sumOdd-sumEven; 
    }

    public static void main (String[] args){
        
        int[] arr1 = {1};
        int[] arr2 = {1,2};
        int[] arr3 = {1,2,3};
        int[] arr4 = {1,2,3,4};
        int[] arr5 = {3,3,4,4};
        int[] arr6 = {3,2,3,4};
        int[] arr7 = {4,1,2,3};
        int[] arr8 = {1,1};
        int[] arr9 = {};

        System.out.println(a1(arr1));
        System.out.println(a1(arr2));
        System.out.println(a1(arr3)); 
        System.out.println(a1(arr4)); 
        System.out.println(a1(arr5)); 
        System.out.println(a1(arr6)); 
        System.out.println(a1(arr7)); 
        System.out.println(a1(arr8)); 
        System.out.println(a1(arr9));

       /*  System.out.println(a1(new int[]{1}));
        System.out.println(a1(new int[]{1,2}));
        System.out.println(a1(new int[]{1,2,3}));
        System.out.println(a1(new int[]{1,2,3,4}));
        System.out.println(a1(new int[]{3,3,4,4}));
        System.out.println(a1(new int[]{3,2,3,4})); 
        System.out.println(a1(new int[]{4,1,2,3})); 
        System.out.println(a1(new int[]{1,1})); 
        System.out.println(a1(new int[]{})); 
        OR */
        

    }

}