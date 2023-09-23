import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
/**
 Java program to create a file and write data into file.
 */


public class _25_CreateAFileAndWriteAFile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please write something: ");
        String in =sc.nextLine();
        sc.close();
        try{
            File file = new File("C:\\Users\\Administrator\\Desktop\\JAVA\\_25_file1.txt");
            FileWriter writer= new FileWriter(file);
            writer.write(in);
            writer.close();

            System.out.println("Data has been written to the file.");

        }catch(IOException e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        

    }
}