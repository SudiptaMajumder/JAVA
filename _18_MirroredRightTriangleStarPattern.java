/**
 Java program to print mirrored right triangle star pattern series

 Input
    Input rows: 5
 Output

    *
   **
  ***
 ****
*****

 */
import java.util.Scanner;
public class _18_MirroredRightTriangleStarPattern {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rows: ");
        int row = sc.nextInt();

        printMirroredRightTriangleStarPattern(row);
        sc.close();
    }

    static void printMirroredRightTriangleStarPattern(int n){
        for (int i=1 ;i<=n; i++){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
