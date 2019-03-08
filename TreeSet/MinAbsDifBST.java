public class Solution{
  int min = Integer.MAX_VALUE;
  Integer prev = null;
  public int getMinDiff(TreeNode root){
    if(root == null) return min;
    getMinDiff(root.left);
    if(prev != null){
      min = Math.min(min, root.val - prev);
    }
    prev = root.val;
    getMinDiff(root.right);
    return min;
  }
}
