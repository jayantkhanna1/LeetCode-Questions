/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        TreeNode left=root.left;
        TreeNode right=root.right;
        boolean check=mirror(left,right);
        if (check == true)
            return true;
        return false;
    }
    public boolean mirror(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        else if(left == null || right == null){
            return false;
        }
        else 
            if (left.val == right.val)
                return (mirror(left.left, right.right)&& mirror(left.right, right.left));
            return false;
    }
}