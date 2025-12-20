package GFG;


import BinaryTree.TreeNode;

public class FloorInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);

        System.out.println(findCeil(root,3));
    }
static int maxs;
    private static int findCeil(TreeNode root, int key) {
        maxs =-1;
        inorder(root,key);
        return maxs;
    }


    private static void inorder(TreeNode root, int key) {
        if(root == null){
            return;
        }

        inorder(root.left,key);
        if(root.val>key){
            return;
        }
        maxs = root.val;
        inorder(root.right,key);
    }
}
