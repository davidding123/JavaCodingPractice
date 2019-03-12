class Solution{
  int max = Integer.MIN_VALUE;
  public int maxPathSum(TreeNode root){
    if(root == null) return 0;
    helper(root);
    return max;
  }
  public int helper(TreeNode root){
    if(root == null) return  0;
    int left = helper(root.left);
    int right = helper(root.right);
    max = Math.max(Math.max(left, 0) + Math.max(right, 0) + root.val, max);
  }
}
