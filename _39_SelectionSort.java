/* 
Selection Sort
  
Idea: The inner loop selects the minimum element in the
unsorted array and places the elements in increasing order.
Time complexity: O(N2)
 */


public class _39_SelectionSort {
    public static void main(String[] args){
        
        int arr[] = {11,9,1,5,0};

        //Selection Sort
        for(int i = 0; i<arr.length-1 ; i++){

            int smallest = i;

            for(int j =i+1; j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }

            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("in Ascending order: ");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
