/* 
 Insertion Sort

 Idea: Take an element from the unsorted array, place it in its
corresponding position in the sorted part, and shift the elements
accordingly.
Time Complexity: O(N2)
 */

public class _40_InsertionSort {
    public static void main (String[] args){

        int arr[] ={14,33,27,10,35,19,42,44};

        //Insertion Sort
        for(int i =1; i< arr.length ; i++){
           
            int current = arr[i];
            int j =i-1;
            
            while(j >= 0 && arr[j] > current){
                //swap
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        

        System.out.println("in Ascending order: ");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
