//Given a binary search tree (BST) with duplicates, 
//find all the mode(s) (the most frequently occurred element) in the given BST.

//Assume a BST is defined as follows:

//The left subtree of a node contains only nodes with keys less than or equal to the node's key.
//The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
//Both the left and right subtrees must also be binary search trees.
//For example:
//Given BST [1,null,2,2],

class Solution{
List<Integer> list = new ArrayList<>();
Integer prev = Integer.MIN_VALUE;
public int count = 0;
public int max = 0;

public int [] findMode(TreeNode root){
  helper(root);
  int [] res = new int[list.size()];
  for(int i = 0; i < list.size(); i++){
    res[i] = list.get(i);
  }
  return res;
}
  
  public void helper(TreeNode root){
    if(root == null) return;
    helper(root.left);
    if(root.val == prev) count++;
    else if(root.val != prev) count = 1;
    if(count > max){
      list.clear();
      list.add(root.val);
      max = count;
    }else if(count == max){
      list.add(root.val);
    }
    prev = root.val;
    helper(root.right);
  }
}
