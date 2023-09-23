import java.util.Scanner;

//Find Sum of digits of a Number Using Recursion


public class _8_SumofDigitsNumberUsingRecursion {
    
    static int sumofdigits(int n){
        if(n!=0){
            int x = n%10;
            int y = n/10;
            return x+sumofdigits(y);
        }else{
            return 0;  
        }      
    }

    public static void main (String[] args){
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = sumofdigits(num);
        System.out.println("Sum of digits " +num+ " is: "+result);
        sc.close();
    }
}
