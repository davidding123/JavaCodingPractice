/*
Given the root of a binary tree, then value v and depth d, 
you need to add a row of nodes with value v at the given depth d. The root node is at depth 1.

The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1, 
create two tree nodes with value v as N's left subtree root and right subtree root. 
And N's original left subtree should be the left subtree of the new left subtree root, 
its original right subtree should be the right subtree of the new right subtree root. 
If depth d is 1 that means there is no depth d-1 at all, 
then create a tree node with value v as the new root of the whole original tree, 
and the original tree is the new root's left subtree.
*/

class Solution{
  public TreeNode addOneRow(TreeNode root, int v, int d){
    if(d == 1){
      TreeNode newRoot = new TreeNode(v);
      newRoot.left = root;
      return newRoot;
    }
    helper(root, 1, v, d);
    return root;
  }
  
  public void helper(TreeNode root, int depth, int v, int d){
    if(root == null) return;
    if(depth == d - 1){
      TreeNode newLeft = new TreeNode(v);
      TreeNode newRight = new TreeNode(v);
      TreeNode temp = root.left;
      root.left = newLeft;
      newLeft.left = temp;
      temp = root.right;
      root.right = newRight;
      newRight.right = temp;
      return;
    }
    helper(root.left, depth + 1, v, d);
    helper(root.right, depth + 1, v, d);
  }
}
