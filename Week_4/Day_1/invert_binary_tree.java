class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if(root!=null)
        {
        invertTree(root.left);
        invertTree(root.right);
        //swap the pointers in node 
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        }
    return root;
        
    }
}
