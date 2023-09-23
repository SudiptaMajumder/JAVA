import java.util.Scanner;

/*
  java program to print all prime numbers between 1 to n
 */

public class _13_PrintAllPrimeNumbers {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter lower limit: ");
        int low = sc.nextInt();
        System.out.print("Enter higher limit: ");
        int high = sc.nextInt();

        System.out.println("All prime numbers between "+low+" to "+high+" are:");
        
        if(low<=2){
            low=2;
        } 
        int count=0;
        for(int i=low;i<high;i++){
            int isPrime=1;
            
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=0;
                    break;
                }
            }
            if(isPrime==1){
                System.out.print(i+ " ");
                count++;
            }
        }

        System.out.println("\nTotal Prime Numbers are: "+ count);
        sc.close();
    }
}
