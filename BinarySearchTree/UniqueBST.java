class Solution{
  public List<TreeNode> generateTrees(int n){
    List<TreeNode> list = new ArrayList<>();
    if(n <= 0) return list;
    return helper(1, n);
  }
  
  private List<TreeNode> helper(int l, int r){
    List<TreeNode> list = new ArrayList<>();
    if(l > r){
      list.add(null);
      return list;
    }
    for(int i = l; i <= r; i++){
      List<TreeNode> leftSub = helper(l, i - 1);
      List<TreeNode> rightSub = helper(i + 1, r);
      for(TreeNode left : leftSub){
        for(TreeNode right : rightSub){
          TreeNode root = new TreeNode(i);
          root.left = left;
          root.right = right;
          list.add(root);
        }
      }
    }
    return list;
  }
}
