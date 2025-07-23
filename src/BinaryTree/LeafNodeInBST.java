package BinaryTree;

public class LeafNodeInBST {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preorder(root);
    }

    private static void preorder(Node root) {
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            System.out.print(root.val+" ");
        }
        preorder(root.left);
        preorder(root.right);
    }
}
