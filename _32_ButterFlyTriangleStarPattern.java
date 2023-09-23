/* 
Butter Fly Star pattern

Input
    Input number of rows: 4 
 Output

*      *
**    **
***  ***
********
********
***  *** 
**    **
*      *

 */
import java.util.*;
public class _32_ButterFlyTriangleStarPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rows: ");
        int row = sc.nextInt();

        butterFlyTriangleStarPattern(row);
        sc.close();
    }

    static void butterFlyTriangleStarPattern(int n){
        
        //upper part
        for(int i=1; i <=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            int space = 2* (n-i);
            for(int m= 1; m<=space; m++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print("*");
            }

            System.out.println();
        }
        
        //lower part
        for(int i = 1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            
            for(int m =1; m<=2*(i-1); m++){
                System.out.print(" ");
            }

            for(int k=i; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
