/* 
print this pattern

*****
*****
*****
*****

 */


public class _30_Pattern {
    public static void main(String args[]){
        System.out.println("Pattern (like as square) ");

        int n= 5;
        int m =4;
        for (int x = 1; x<=m ; x++){
            for (int y = 1 ; y<= n; y++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
