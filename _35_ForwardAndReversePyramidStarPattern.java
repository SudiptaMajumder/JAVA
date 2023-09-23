
/*
 Java program to print equilateral triangle or pyramid star pattern

 Input
 Input rows: 4

 Output
   *   
  ***  
 ***** 
*******
*******
 ***** 
  ***
   *

*/
import java.util.*;

public class _35_ForwardAndReversePyramidStarPattern {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rows: ");
        int row = sc.nextInt();

        UperLowerPyramidStarPattern(row);
        sc.close();
    }

    static void UperLowerPyramidStarPattern(int n){
        //Upper part
        for(int i = 1;  i <= n ; i++){
            //Space
            for(int j =1; j<= n-i; j++){
                System.out.print(" ");
            }
            
            for (int j =1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Part
        for(int i =1; i<=n; i++){
            //Space
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }

            for(int j=i; j<=(2*n)-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
