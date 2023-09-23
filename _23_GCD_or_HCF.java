/**
Java program to find HCF of two numbers

HCF (Highest Common Factor) is the greatest number that divides exactly two or more numbers. 
HCF is also known as GCD (Greatest Common Divisor) or GCF (Greatest Common Factor).
Input
    Input first number: 12
    Input second number: 30

Output
    HCF of 12 and 30: 6

 */
import java.util.Scanner;
public class _23_GCD_or_HCF{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        int firstNumber= sc.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = sc.nextInt();

        int result = hcf(firstNumber,secondNumber);
        System.out.print("HCF of "+ firstNumber +" and "+ secondNumber +": " + result);

        sc.close();
    }

    static int hcf(int firstNumber, int secondNumber){
        int gcd = 0;
        int min = (firstNumber<secondNumber)? firstNumber:secondNumber;
        for(int i=1; i<= min ; i++){
            if(firstNumber%i == 0 && secondNumber%i == 0){
                gcd=i;
            }
        }

        return gcd;
    }
}