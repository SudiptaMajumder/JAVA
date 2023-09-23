/* 
Rombus Star  pattern

Input
    Input number of rows: 5
 Output

    *****
   *****
  *****
 *****
*****


 */

import java.util.*;
public class _33_RombusStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number of rows: ");
        int row = sc.nextInt();

        rombusStarPattern(row);
        sc.close();
    }

    static void rombusStarPattern(int n){
        for(int i = 1 ; i <= n; i++){

            for(int j = i ; j < n; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
