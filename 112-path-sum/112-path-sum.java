class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
    
        return get(root,targetSum,0);
        
    }
    boolean get(TreeNode root,int target,int sum)
    {
        if(root==null)
            return false;
         sum+=root.val;
        if(root.left==null && root.right==null) // if it is leaf node left and right child must be null
            if(sum==target)
                return true;
        return get(root.right,target,sum) || get(root.left,target,sum);
        
    }
}