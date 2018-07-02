//Given a binary tree, you need to compute the length of the diameter of the tree. 
//The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
//This path may or may not pass through the root.
class Solution{
  public int max = Integer.MIN_VALUE;
  public int diameterOfBT(TreeNode root){
    if(root == null) return 0;
    helper(root);
    return max;
  }
  
  private void helper(TreeNode root){
    if(root == null) return 0;
    int left = helper(root.left), right = helper(root.right);
    max = Math.max(max, left + right);
    return Math.max(left, right) + 1;
  }
}
