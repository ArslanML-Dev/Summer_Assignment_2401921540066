public class Codec 
{

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
        if (root == null) return "null";
        // Preorder traversal with commas
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        String[] nodes = data.split(",");
        // Use a list so we can consume elements one by one
        List<String> nodeList = new LinkedList<>(Arrays.asList(nodes));
        return buildTree(nodeList);
    }

    private TreeNode buildTree(List<String> nodes) 
    {
        if (nodes.isEmpty()) return null;

        String val = nodes.remove(0); // inefficient removal from front
        if (val.equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);

        return root;
    }
}

