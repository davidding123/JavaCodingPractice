class Solution{
  int sum = 0;
  public TreeNode convertBST(TreeNode root){
    if(root == null) return null;
    helper(root);
    return root;
  }
  private void helper(TreeNode root){
    if(root == null) return;
    helper(root.right);
    root.val += sum;
    sum = root.val;
    helper(root.left);
  }
}
