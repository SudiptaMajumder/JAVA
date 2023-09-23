/* Write a function to reverse an integer using numeric operators and
without using any arrays or other data structures.

The signature of the function is:
int f(int n)

Examples
if the input integer is return
1234                    4321
12005                   50021
1                       1
1000                    1
0                       0
-12345                  -54321 
*/

public class _4_ReverseInteger {
    
    static int reverse(int n){
        int sign = 1;
        if (n == 0){
            return 0;
        }
        if (n < 0){
            sign = -1;
            n = -n;
        }     
        
        int reverse=0;
        while(n!=0){
            reverse =(n%10) + (reverse*10);
            n=n/10;
        }     

        return sign* reverse;
    }

    public static void main (String[] args){
        System.out.println(reverse(1234)); 
        System.out.println(reverse(12005));
        System.out.println(reverse(1));
        System.out.println(reverse(1000));
        System.out.println(reverse(0));
        System.out.println(reverse(-12345));
    }
       
}
