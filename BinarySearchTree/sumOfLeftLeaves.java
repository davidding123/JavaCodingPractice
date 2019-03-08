class Solution{
  public int sumOfLeftLeaves(TreeNode root){
    if(root == null) return 0;
    int sum = 0;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    while(!stack.isEmpty()){
      TreeNode p = stack.pop();
      if(p.left != null){
        if(p.left.left == null && p.left.right == null){
          sum += p.left.val;
        }else{
          stack.push(p.left);
        }
      }
      if(p.right != null) stack.push(p.right);
    }
    return sum;
  }
}
