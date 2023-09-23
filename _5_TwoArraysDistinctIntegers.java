/* Write a function to return an array containing all elements common to two given arrays
containing distinct positive integers. You should not use any inbuilt methods. 
You are allowed to use any number of arrays.

The signature of the function is:
int[] f(int[] first, int[] second)

Examples
if input parameters are         return
{1, 8, 3, 2}, {4, 2, 6, 1}	    {1, 2}
{1, 8, 3, 2, 6}, {2, 6, 1}	    {2, 6, 1}
{1, 3, 7, 9}, {7, 1, 9, 3}	    {1, 3, 7, 9}
{1, 2}, {3, 4}	                {}
{}, {1, 2, 3}	                {}
{1, 2}, {}	                    {}
{1, 2}, null	                null
null, {}	                    null
null, null	                    null 
*/

public class _5_TwoArraysDistinctIntegers {
    
    static int[] f (int[] first, int[] second){
        
        if(first==null|| second ==null) return null;
        
        int[] a,b;
        int minLength=0;
        if(first.length>=second.length){
            a = first;
            b = second;
            minLength = second.length;
        }
        else{
            a = second;
            b = first;
            minLength =first.length;
        }

        int[] result = new int[minLength];
        int k=0;
        for(int i=0; i<a.length;i++){
            for(int j=0; j<b.length;j++){
                if(a[i]==b[j]){
                     result[k]=a[i];
                     k++;
                }                
            }
        }

        int[] finalResult = new int[k];
        for(int i=0;i<finalResult.length;i++){
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static void main (String[] args){
        printArray(f (new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1}));
        printArray(f (new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1}));
        printArray(f (new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3}));
        printArray(f (new int[]{1, 2}, new int[]{3, 4}));
        printArray(f (new int[]{}, new int[]{1, 2, 3}));
        printArray(f (new int[]{1, 2},new int[]{}));
        printArray(f (new int[]{1, 2}, null));
        printArray(f (null, new int[]{}));
        printArray(f (null, null));
    }

    static void printArray(int[] arr){
        if(arr==null){
            System.out.println("null");
        }else{
            System.out.print("{");
            for(int i=0; i<arr.length;i++){
                System.out.print(""+arr[i] +"" );
                if(i<arr.length-1){
                    System.out.print(",");
                }
            }
            System.out.println("}");
        }           
       
    }
}
