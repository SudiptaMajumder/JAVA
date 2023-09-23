/*
  java program to whether a number is prime number or not
 */
import java.util.Scanner;
public class _12_ProgramToCheckPrimeNumber {

    public static void main (String[] args){
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int isPrime=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime=0;
                break;
            }
        }
        if(isPrime==1 & num>1){
            System.out.println(num + " is a Prime Number.");
        }else{
            System.out.println(num + " is a Composite Number.");
        }
        sc.close();
    }
}