class Solution{
  public int max = Integer.MIN_VALUE;
  public int rob(TreeNode root){
    if(root == null) return 0;
    if(root.left == null && root.right == null) return root.val;
    helper(root);
    return max;
  }
  
  private int [] helper(TreeNode root){
    if(root == null) return new int[2];
    int [] left = helper(root.left);
    int [] right = helper(root.right);
    int rob = left[0] + right[0] + root.val;
    int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
    max = Math.max(rob, notRob);
    return new int[]{notRob, rob};
  }
}
