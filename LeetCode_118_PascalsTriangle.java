/* 118. Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]] 
*/

import java.util.*;

public class LeetCode_118_PascalsTriangle {

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>>  triangle = new ArrayList<>();

    // Base case: The first row is always [1].
    List<Integer> firstRow  = new ArrayList<>();
    firstRow.add(1);
    triangle.add(firstRow);

    // Generate the rest of the rows.
    for (int rowNum = 1; rowNum<numRows; rowNum++ ){
      List<Integer> previousRow  =  triangle.get(rowNum-1);
      List<Integer> currentRow  = new ArrayList<>();
      // The first element in each row is always 1.
      currentRow.add(1);

      for(int j =1;j<rowNum; j++){
        int sum = previousRow.get (j-1)+ previousRow.get(j);
        currentRow.add(sum);
      }
      
      // The last element in each row is always 1.
      currentRow.add(1);

      triangle.add(currentRow);
    }
    return triangle;
  }

  public static void main(String args[]) {
    List<List<Integer>> List1 = generate(5);
    // Print the generated Pascal's triangle
    System.out.println("1st list:");
    for (List<Integer> row : List1) {
      System.out.println(row);
    }

    List<List<Integer>> List2 = generate(1);
    // Print the generated Pascal's triangle
    System.out.println("2nd list:");
    for (List<Integer> row : List2) {
      System.out.println(row);
    }
  }
}
