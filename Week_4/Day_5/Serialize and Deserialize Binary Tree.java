public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helperSerialize(root, sb);
        return sb.toString();
    }

    private void helperSerialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");
        helperSerialize(root.left, sb);
        helperSerialize(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        int[] index = {0};
        return helperDeserialize(nodes, index);
    }

    private TreeNode helperDeserialize(String[] nodes, int[] index) {
        if (nodes[index[0]].equals("null")) {
            index[0]++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(nodes[index[0]++]));
        root.left = helperDeserialize(nodes, index);
        root.right = helperDeserialize(nodes, index);

        return root;
    }
}
