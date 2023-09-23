/**
 Java program to print reverse pyramid star pattern

 Input
    Input rows: 5
 Output

*********
 *******
  *****
   ***
    *

 */

import java.util.Scanner;
public class _16_ReversePyramidStarPattern{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Input rows: ");
        int row = sc.nextInt();

        printReversePyramid(row);
        sc.close();
    }

    static void printReversePyramid(int n){
        for (int i=1; i<=n; i++){
            
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }

            for(int k=i; k<=(2*n)-i; k++){
                System.out.print("*");
            }
          
            System.out.println(); // Move to the next line.
        }
    }
}