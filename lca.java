public class lca {
    static class TreeNode {
        int data;
        TreeNode left, right;
        
        TreeNode(int value) {
            this.data = value;
            left = right = null;
        }
    }
    
    public static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }
        if(left!=null){
            return left;
        }

        return right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        TreeNode p = root.left;
        TreeNode q = root.right; 

        TreeNode lca = LCA(root, p, q);
        System.out.println("LCA : " +lca.data);
    }
}
