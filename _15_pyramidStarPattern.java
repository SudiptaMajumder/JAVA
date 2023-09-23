import java.util.Scanner;

/*
 Java program to print equilateral triangle or pyramid star pattern

 Input
 Input rows: 5

 Output
    *
   ***
  *****
 *******
*********

    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */


public class _15_pyramidStarPattern {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rows: ");
        int row = sc.nextInt();

        printPyramidStarPattern(row);
        System.out.println();
        printPyramidStarPatternWithDigit(row);
        sc.close();
    }


    static void printPyramidStarPattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=i; j<=n-1; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }
    }

    static void printPyramidStarPatternWithDigit(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
