/* 104. Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node 
down to the farthest leaf node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2 */

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

public class LeetCode_104_MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    if(root== null){
        return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    
    int count = Math.max(left, right) + 1;
    return count;
  }

  public static void main(String[] args) {
    LeetCode_104_MaximumDepthOfBinaryTree obj = new LeetCode_104_MaximumDepthOfBinaryTree();

    //Example 1:
    TreeNode root1 = new TreeNode(3);
    root1.left = new TreeNode(9);
    root1.right = new TreeNode(20);
    root1.right.left = new TreeNode(15);
    root1.right.right = new TreeNode(7);
    System.out.println(obj.maxDepth(root1));

    //Example 2:
    TreeNode root2 = new TreeNode(1);
    root2.right = new TreeNode(2);
    System.out.println(obj.maxDepth(root2));


  }
}
