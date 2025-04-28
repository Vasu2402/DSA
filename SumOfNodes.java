public class SumOfNodes {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int value){
            this.data = value;
            left=right=null;
        }
    }
    
    public static int sum(TreeNode root){
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(70);
        
        System.out.println(sum(root));
    }
}