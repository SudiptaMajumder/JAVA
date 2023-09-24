/* 
108. Convert Sorted Array to Binary Search Tree

Given an integer array nums where the elements are sorted in ascending order, convert it to a 
height-balanced binary search tree.

Example 1:
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
*/


public class LeetCode_108_ConvertSortedArraytoBinarySearchTree {

  public TreeNode sortedArrayToBST(int[] nums) {
    return resultSortedArrayToBST(nums, 0, nums.length - 1);
  }

  private TreeNode resultSortedArrayToBST(int[] nums, int left, int right) {
    if(left>right){
        return null;
    }
    int mid = left+(right-left)/2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = resultSortedArrayToBST(nums, left, mid-1);
    root.right = resultSortedArrayToBST(nums, mid+1, right);
    return root;
  }

  // Helper function to print the tree in-order (for verification purposes)
  private static void inOrderTraversal(TreeNode root) {
    if (root == null) {
      return; 
    }
    inOrderTraversal(root.left);
    System.out.print(root.val + " ");
    inOrderTraversal(root.right);
  }

  public static void main(String[] args) {
    LeetCode_108_ConvertSortedArraytoBinarySearchTree obj = new LeetCode_108_ConvertSortedArraytoBinarySearchTree();

    TreeNode result1 = obj.sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });
    inOrderTraversal(result1);
    System.out.println();

    TreeNode result2 = obj.sortedArrayToBST(new int[] { 1, 3 });
    inOrderTraversal(result2);
  }
}

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
