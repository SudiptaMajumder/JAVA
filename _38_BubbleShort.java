/* 
  Bubble Sort
   
Idea: if arr[i] > arr[i+1] swap them. To place the element in their
respective position, we have to do the following operation N-1
times.
Time Complexity: O(N2)
 */


public class _38_BubbleShort {
    public static void main(String[] args){
        
        int arr[] = {8,3,5,1};
        
        //Bubble Short
        for (int i = 0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }


        System.out.println("In Ascending Order:");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
