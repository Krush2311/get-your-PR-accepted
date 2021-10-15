
// Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 //Program to perform searching in BST
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
      // run while roop with condition where root is not null
      //if the root will be null at first, it will return null
        while(root!=null)
        {
            if(val==root.val)
                return root;
            else if(val<root.val)
                root=root.left;
            else
                root=root.right;
        }
        return null;
    }
}
