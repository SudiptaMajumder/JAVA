/**
Java program to count number of characters, words and lines in a text file.

Example:
     Source file
I love programming.
Working with files in C programming is fun.
I am learning C programming at Codeforwin.
    Output
Total characters = 106
Total words      = 18
Total lines      = 3
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _26_countCharactersWordsAndLinesInAFile{
    public static void main(String[] args){
        try{
            File file = new File("C:\\Users\\Administrator\\Desktop\\JAVA\\_25_file1.txt");
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            String line;

            while((line=bReader.readLine())!= null){
                charCount+=line.length();
                
                 // Split the line into words using whitespace as the delimiter
                 String[] words = line.split("\\s+");
                 wordCount += words.length;
                 lineCount++;
            }
            
            System.out.println("Total characters = " + charCount);
            System.out.println("Total words      = " + wordCount);
            System.out.println("Total lines      = " + lineCount);

            fReader.close();
            bReader.close();

        }catch(IOException e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
    }
}
