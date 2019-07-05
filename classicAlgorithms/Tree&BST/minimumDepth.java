 int minimumDepth(Node root) 
    { 
        // Corner case. Should never be hit unless the code is 
        // called on root = NULL 
        if (root == null) 
            return 0; 
  
        // Base case : Leaf Node. This accounts for height = 1. 
        if (root.left == null && root.right == null) 
            return 1; 
  
        // If left subtree is NULL, recur for right subtree 
        if (root.left == null) 
            return minimumDepth(root.right) + 1; 
  
        // If right subtree is NULL, recur for left subtree 
        if (root.right == null) 
            return minimumDepth(root.left) + 1; 
  
        return Math.min(minimumDepth(root.left), 
                        minimumDepth(root.right)) + 1; 
    } 
