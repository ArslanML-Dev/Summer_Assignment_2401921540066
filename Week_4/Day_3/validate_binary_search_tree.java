class Solution 
{
    public boolean isValidBST(TreeNode root) 
    {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode node, long min, long max) 
    {
        if (node == null) return true;

        // current node must be within bounds
        if (node.val <= min || node.val >= max) 
        {
            return false;
        }

        // recursively check left and right subtrees
        boolean leftValid = helper(node.left, min, node.val);
        boolean rightValid = helper(node.right, node.val, max);

        return leftValid && rightValid;
    }
}


