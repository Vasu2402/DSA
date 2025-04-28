
class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeHeight {
    Node root;
    int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTreeHeight tree = new BinaryTreeHeight();

        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of the tree is: " + tree.height(tree.root));
    }
}
