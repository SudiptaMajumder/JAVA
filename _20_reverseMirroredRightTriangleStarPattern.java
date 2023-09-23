/**
 Java program to print reverse mirrored right triangle star pattern

 Input
    Input rows: 5
 Output

*****
 ****
  ***
   **
    *

 */
import java.util.Scanner;
public class _20_reverseMirroredRightTriangleStarPattern {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rows: ");
        int row= sc.nextInt();

        printReverseMirroredRightTriangleStarPattern(row);
        sc.close();
    }

    static void printReverseMirroredRightTriangleStarPattern (int n){
        for (int i=1; i<=n; i++){

            /* for(int x=i; x < (2*i)-1; x++){
                System.out.print(" ");
            } */

            for(int x=1; x<i ; x++){
                System.out.print(" ");
            }

            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
