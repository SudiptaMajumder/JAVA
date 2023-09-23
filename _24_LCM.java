/**
 Java program to find LCM of any two numbers
 LCM is a smallest positive integer that exactly divides two or more numbers. For Example
 Input
    Input number1: 12
    Input number2: 30
 Output
    LCM = 60
 */
import java.util.Scanner;
public class _24_LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Input number 2: ");
        int number2 = sc.nextInt();

        int result = lcm(number1, number2);
        System.out.print("LCM: " + result);
        sc.close();
    }

    static int lcm(int num1, int num2){
        int lcm;
        int max = (num1>num2)? num1:num2;
        while(true){
            if(max%num1==0 && max%num2==0){
                lcm = max;
                break;
            }
            max++;
        }
        return lcm;
    }
}
