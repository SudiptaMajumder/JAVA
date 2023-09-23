/*
Write a function that accepts an array of non-negative integers and returns the second largest integer 
in the array. Return -1 if there is no second largest.
The signature of the function is
int f(int[ ] a)
Examples:
if the input array is	return
{1, 2, 3, 4}	        3
{4, 1, 2, 3}	        3
{1, 1, 2, 2}	        1
{1, 1}	               -1
{1}	                   -1
{}	                   -1

*/

public class _7_SecondHeightInArray {

    static int a1(int[] a){
        int max1= -1;
        int max2= -1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2= max1;
                max1=a[i];
            }else if(a[i]!=max1 && a[i]> max2){
                max2 = a[i];
            }
            
        }

        return max2;

    }


    public static void main (String[] args){
        
        /* System.out.println(a1(new int[]{1, 2, 3, 4}));
        System.out.println(a1(new int[]{4, 1, 2, 3}));
        System.out.println(a1(new int[]{1, 1, 2, 2}));
        System.out.println(a1(new int[]{1, 1}));
        System.out.println(a1(new int[]{1}));
        System.out.println(a1(new int[]{})); 
        OR
        */
        
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 1, 2, 3};
        int[] arr3 = {1, 1, 2, 2};
        int[] arr4 = {1, 1};
        int[] arr5 = {1};
        int[] arr6 = {};

        System.out.println(a1(arr1)); // should print 3
        System.out.println(a1(arr2)); // should print 3
        System.out.println(a1(arr3)); // should print 1
        System.out.println(a1(arr4)); // should print -1
        System.out.println(a1(arr5)); // should print -1
        System.out.println(a1(arr6)); // should print -1

    }
}
