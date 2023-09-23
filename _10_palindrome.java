import java.util.Scanner;

//java program to check whether a number is palindrome or not

public class _10_palindrome {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        sc.close();

        if(isPalindrome(num)){
            System.out.println( num + " is a palindrom number.");
        }else{
            System.out.println( num + " is not a palindrom number");
        }      

    }

    static boolean isPalindrome(int n){
        int originalNumber= n;
        int reverseNumber = 0;

        while(n>0){
            int digit =  n%10;
            reverseNumber = (reverseNumber*10) + digit;
            n = n/10;
        }

        return (originalNumber==reverseNumber);
        
    }
}
