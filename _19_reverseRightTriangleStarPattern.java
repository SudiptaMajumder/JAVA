/**
 Reverse right triangle star pattern program in Java

 Input
    Input rows: 5
 Output

*****
****
***
**
*

12345
1234
123
12
1

 */

import java.util.Scanner;

public class _19_reverseRightTriangleStarPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rows: ");
        int row= sc.nextInt();

        printReverseRightTriangleStarPattern(row);
        System.out.println();
        printReverseRightTriangleStarPatternWithDigit(row);
        sc.close();
    }

    static void printReverseRightTriangleStarPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j =i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printReverseRightTriangleStarPatternWithDigit(int n){
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        for(int i=1; i<=n; i++){
            int number = 1;
            for(int j =i; j<=n; j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}