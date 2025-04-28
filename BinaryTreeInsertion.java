import java.util.*;
public class BinaryTreeInsertion {

    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int value){
            this.data = value;                                 
            left=right=null;
        }
    }
    
    public static void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.left=new TreeNode(60);
        root.right.right=new TreeNode(70);
        
        inorder(root);
    }
    public static void insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.left == null) {
                current.left = new TreeNode(value);
                break;
            } else {
                queue.add(current.left);
            }
            if (current.right == null) {
                current.right = new TreeNode(value);
                break;
            } else {
                queue.add(current.right);
            }
        }
    }
}