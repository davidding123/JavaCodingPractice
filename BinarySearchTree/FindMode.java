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
  
