public boolean isValid(TreeNode root){
  if(root == null) return true;
  return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
}

public void helper(TreeNode root, long max, long min){
  if(root == null) return true;
  if(root.val <= min || root.val >= max) return false;
  return helper(root.left, root.val, min) && helper(root.right, max, root.val);
}
