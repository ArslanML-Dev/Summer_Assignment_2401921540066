
class Solution  
{
     boolean dfs(TreeNode root, int sum)
    {
        if(root==null) return false;

        if(root.left==null && root.right==null)
        return root.val==sum;

        boolean left= dfs(root.left, sum-root.val);
        boolean right=dfs(root.right, sum-root.val);

        return left||right;
    }
    public boolean hasPathSum(TreeNode root, int sum) 
    {
         return dfs(root,sum);
        
    }
}
