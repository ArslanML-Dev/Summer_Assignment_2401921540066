class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;

        if (root.val == val) 
        {
            return root;
        } 
        else if (val < root.val) 
        {
            return searchBST(root.left, val);  // go left
        } else 
        {
            return searchBST(root.right, val); // go right
        }
    }
}
