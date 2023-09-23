/*
 Java program to print right triangle star pattern series

 Input
    Input number of rows: 5
 Output

*
**
***
****
*****

1
12
123
1234
12345

1
2 3
4 5 6
7 8 9 10 
11 12 13 14 15

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

0 
1 0
0 1 0
1 0 1 0
0 1 0 1 0 

 */
import java.util.Scanner;
public class _17_RightTriangleStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int row = sc.nextInt();

        rightTriangleStarPattern(row);
        System.out.println();
        rightTriangleStarPatternWithDigit(row);
        System.out.println();
        rightTriangleStarPatternWithSequence(row);
        System.out.println();
        rightTriangleStarPatternWithBinary(row);
        System.out.println();
        rightTriangleStarPatternWithBinary2(row);
        sc.close();
    }

    static void rightTriangleStarPattern(int n){
        for( int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    static void rightTriangleStarPatternWithDigit (int n){
        for(int i = 1; i <=n ; i++){
            for( int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void rightTriangleStarPatternWithSequence(int n){
        int number=1;
        for(int i= 1; i<=n; i++){
            for(int j =1; j<=i ; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
    }

    static void rightTriangleStarPatternWithBinary(int n){
        for (int i=1; i <=n ; i++){
            for(int j =1;j<=i;j++){
               if( (i+j)%2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }


    static void rightTriangleStarPatternWithBinary2(int n){
        for (int i=1; i <=n ; i++){
            for(int j =1;j<=i;j++){
                int k = (i+j)%2;
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
