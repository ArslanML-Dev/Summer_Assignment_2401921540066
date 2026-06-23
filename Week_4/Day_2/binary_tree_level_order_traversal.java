class Solution {
    void bfs(TreeNode root,List<List<Integer>> res)
    {
        if(root==null)
        return;
        //level order traversal
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0;i<size;i++)
            {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            res.add(level);
            
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        bfs(root,res);
        return res;                
    }
}
