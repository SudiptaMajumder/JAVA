import java.util.Scanner;

/*
  Java program to find factorial of any number using recursion

    Input
    Input any number: 5
    Output
    Factorial of 5 = 120
 */


public class _11_Factorial_Recursion {
    public static void main (String[] args){
        Scanner sc  = new Scanner (System.in);
        System.out.print ("Input any number: ");
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println("Fasctorial of "+ num + " = " + result);
        sc.close();
    }

    static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
        
    }
}
