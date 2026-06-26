class Solution 
{
    boolean dfs(TreeNode t1, TreeNode t2)
    {
        if(t1==null && t2==null)
        return true;

        if(t1==null || t2==null || t1.val!=t2.val)
        return false;

        return dfs(t1.left,t2.right) && dfs(t1.right, t2.left);
    }
    public boolean isSymmetric(TreeNode root) 
    {
        return dfs(root.left,root.right);
    }
}
