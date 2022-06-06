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
    public boolean findTarget(TreeNode root, int k) {
        List <Integer> mylist= new ArrayList<Integer>();
        helper(mylist , root);
        for(int i=0;i<mylist.size();i++){
            for(int j=i+1;j<mylist.size();j++){
                if(mylist.get(i)+mylist.get(j) == k){
                    return true;
                }
            }
        }
        return false;
    }
    public void helper(List<Integer> mylist, TreeNode root){
        if (root == null)
            return;
        helper(mylist,root.left);
        mylist.add(root.val);
        helper(mylist,root.right);
    }
}