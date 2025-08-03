import java.util.*;
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
 
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null) return p==q;
        boolean isleftSameTree=isSameTree(p.left,q.left);
        boolean isrightSameTree=isSameTree(p.right,q.right);
        return (isleftSameTree && isrightSameTree && p.val==q.val);
    }
}
