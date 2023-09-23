/*
 Java program to print equilateral triangle or pyramid star pattern with digit

 Input
 Input rows: 5

 Output

    1
   212
  32123
 4321234
543212345

 */

import java.util.*;
public class _34_pyramidStarPatternWithDigit {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rows: ");
        int rows = sc.nextInt();

        pyramidStarPatternWithDigit(rows);
        sc.close();
    }

    static void pyramidStarPatternWithDigit(int n){
        for(int i =1; i<=n; i++){
            //space
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            //1st part
            for(int k =i; k>=1; k--){
                System.out.print(k);
            }
            
            //2nd part
            for(int m=2; m<=i; m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
