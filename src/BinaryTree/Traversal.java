package BinaryTree;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
      this.val = val;
    }


}
public class Traversal {

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }



}
