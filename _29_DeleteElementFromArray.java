/*
 JAVA program to delete an element from array at specified position

    Input
Enter size of the array : 5
Enter elements in array : 10 20 30 40 50
Enter the element position to delete : 2
    Output
Elements of array after delete are : 10, 30, 40, 50

 */
import java.util.*;
public class _29_DeleteElementFromArray  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter elements in array : ");
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element position to delete : ");
        int position = scanner.nextInt();

        if(position<1 || position>size ){
            System.out.print("Invalid position! ");
        }else{
                        
            int[] resultArray = new int[size-1];
            int index=0;
            for(int i=0; i<size; i++){
                if(i!=position-1){
                    resultArray[index] = arr[i];
                    index++;
                }
            }

            System.out.print("Elements of array after delete are : ");
            for(int i=0; i<resultArray.length; i++){
                System.out.print(resultArray[i]);
                if(i != resultArray.length-1){
                    System.out.print(", ");
                }
            }
        }

        scanner.close();
    }
}
