class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

       return 1+Math.max(left, right);//basically height of root(1)+ height of left of left or right subtree which ever is greater , its done for evey node
    }
}
