import java.util.Scanner;

/**
  Java program to list all prime number between an interval using function.

    Input
    Input lower limit: 10
    Input upper limit: 50

    Output
    Prime numbers between 10-50 are: 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */

public class _14_PrimeNumbersBetweenGivenRangeUsingFunction {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input lower limit: ");
        int lowLimit = sc.nextInt();
        System.out.print("Input upper limit: ");
        int upperLimit = sc.nextInt();
        sc.close();
        
        System.out.print("Prime numbers between "+lowLimit+" to "+ upperLimit + " are: ");
        printprimes(lowLimit,upperLimit);
    }

    static void printprimes(int lowNum, int upperNum){
        if(lowNum<2){
            lowNum=2;
        }

        while (lowNum<=upperNum){
            if(isPrime(lowNum)){
                System.out.print(lowNum+", ");
            }
            lowNum++;
        }        
    }

    static boolean isPrime(int num){

        for(int i=2; i<=num/2;i++){
            if( num%i==0){
                return false;
            }
        }
        
        return true;
    }
}
