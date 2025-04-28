public class Postorder {
   static class TreeNode{
       int data;
       TreeNode left,right;
       TreeNode(int value){
           this.data = value;                                 


           left=right=null;
       }
   }
   
   public static void postordert(TreeNode root){
       if(root==null) return ;
       postordert(root.left);
       postordert(root.right);
       System.out.println(root.data+" ");
   }
   public static void main(String[] args) {
       TreeNode root=new TreeNode(10);
       root.left=new TreeNode(20);
       root.right=new TreeNode(30);
       root.left.left=new TreeNode(40);
       root.left.right=new TreeNode(50);
       root.right.left=new TreeNode(60);
       root.right.right=new TreeNode(70);
       
       postordert(root);
   }
}