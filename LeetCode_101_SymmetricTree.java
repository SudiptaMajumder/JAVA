/* 
101. Symmetric Tree
Given the root of a binary tree, check whether it is a mirror of itself
(i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
 */

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

public class LeetCode_101_SymmetricTree {

  public boolean isSymmetric(TreeNode root) {
    if(root == null){
        return true;
    }

    return isMirror (root.left, root.right);
  }

  private boolean isMirror(TreeNode node1, TreeNode node2){
    if(node1 == null && node2 == null){
        return true;
    }else if(node1 == null || node2 == null){
        return false;
    }

    return (node1.val==node2.val) && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
  }

  public static void main(String[] args) {
    LeetCode_101_SymmetricTree obj = new LeetCode_101_SymmetricTree();

    //Example 01
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(2);
    root1.left.left = new TreeNode(3);
    root1.left.right = new TreeNode(4);
    root1.right.left = new TreeNode(4);
    root1.right.right = new TreeNode(3);
    System.out.println(obj.isSymmetric(root1));

    //Example 02
    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(2);
    root2.right = new TreeNode(2);
    root2.left.left = null;
    root2.left.right = new TreeNode(3);
    root2.right.left = null;
    root2.right.right = new TreeNode(3);
    System.out.println(obj.isSymmetric(root2));

    //Example 03
    TreeNode root3 = new TreeNode(1);
    root3.left = new TreeNode(2);
    root3.right = new TreeNode(2);
    root3.left.left = null;
    root3.left.right = new TreeNode(3);
    root3.right.left = new TreeNode(3);
    root3.right.right = null;
    System.out.println(obj.isSymmetric(root3));

  }
}
