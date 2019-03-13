public class Solution{
  public void connect(TreeLinkNode root){
    if(root == null) return;
    if(root.left != null){
      root.left.next = root.right;
      if(root.next != null){
        root.right.next = root.next.left;
      }
    }
    connect(root.left);
    connect(root.right);
  }
  
  public void connect2(TreeLinkNode root){
    TreeLinkNode dummyHead = new TreeLinkNode(0);
    TreeLinkNode pre = dummyHead;
    while(root != null){
      if(root.left != null){
        pre.next = root.left;
        pre = pre.next;
      }
      if(root.right != null){
        pre.next = root.right;
        pre = pre.next;
      }
      root = root.next;
      if(root == null){
        pre = dummyHead;
        root = dummyHead.next;
        dummyHead.next = null;
      }
    }
  }
}
