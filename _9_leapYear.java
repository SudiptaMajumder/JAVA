import java.util.Scanner;

// java program to check Leap Year

public class _9_leapYear {
   
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the year: ");
        int num = sc.nextInt();
        sc.close();

        if(num%4==0 && num%100!=0 || num%400==0){
            System.out.println( num + " is a Leap Year.");
        }
        else {
            System.out.println( num + " is not a Leap Year :(");
        }

    }
}
