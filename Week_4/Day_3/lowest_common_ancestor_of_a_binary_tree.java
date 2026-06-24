
class Solution 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if (root == null) return null;

        // If both nodes are smaller, LCA must be in left subtree
        if (p.val < root.val && q.val < root.val) 
        {
            return lowestCommonAncestor(root.left, p, q);
        }
        // If both nodes are larger, LCA must be in right subtree
        else if (p.val > root.val && q.val > root.val) 
        {
            return lowestCommonAncestor(root.right, p, q);
        }
        // Otherwise, root is the split point → LCA
        else 
        {
            return root;
        }
    }
}
