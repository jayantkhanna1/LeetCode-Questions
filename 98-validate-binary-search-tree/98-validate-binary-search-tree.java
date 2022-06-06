class Solution {
	public boolean isValidBST(TreeNode root) {
		return solve(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean solve(TreeNode root, long mini, long maxi) {
		if (root == null) return true;
		if ((long) (root.val) <= mini || root.val >= maxi)
			return false;
		return solve(root.left, mini, root.val) &&
				solve(root.right, root.val, maxi);
	}
}