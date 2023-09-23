/* 94. Binary Tree Inorder Traversal
 
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]  */

import java.util.*;

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) {
    this.val = val;
  }
  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class LeetCode_94_BinaryTreeInorderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inorderTraversalHelper(root, result);
    return result;
  }

  private void inorderTraversalHelper(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    inorderTraversalHelper(root.left, result);
    result.add(root.val);
    inorderTraversalHelper(root.right, result);
  }

  public static void main(String[] args) {
    LeetCode_94_BinaryTreeInorderTraversal binaryTree = new LeetCode_94_BinaryTreeInorderTraversal();

    //Example 1:
    TreeNode root1 = new TreeNode(1);
    root1.right = new TreeNode(2);
    root1.right.left = new TreeNode(3);
    List<Integer> result1 = binaryTree.inorderTraversal(root1);
    System.out.println(result1); // Output: [1, 3, 2]

    //Example 2:
    TreeNode root2 =null;
    List<Integer> result2 = binaryTree.inorderTraversal(root2);
    System.out.println(result2);// Output: []

    //Example 3:
    TreeNode root3 = new TreeNode(1);
    List<Integer> result3 = binaryTree.inorderTraversal(root3);
    System.out.println(result3);//Output: [1]
  }
}
