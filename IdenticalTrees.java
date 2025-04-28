class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class IdenticalTrees {
    
    Node root1, root2;
    boolean areIdentical(Node node1, Node node2) {

        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return (node1.data == node2.data)
            && areIdentical(node1.left, node2.left)
            && areIdentical(node1.right, node2.right);
    }

    public static void main(String[] args) {
        IdenticalTrees tree = new IdenticalTrees();

        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);

        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);


        if (tree.areIdentical(tree.root1, tree.root2))
            System.out.println("Both trees are identical.");
        else
            System.out.println("Trees are not identical.");
    }
}
