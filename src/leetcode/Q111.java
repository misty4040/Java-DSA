package leetcode;

import BinaryTree.TreeNode;

public class Q111 {
    public static void main(String[] args) {
        BinaryTree.TreeNode root = new BinaryTree.TreeNode(2);
        root.right = new BinaryTree.TreeNode(3);
        root.right.right = new BinaryTree.TreeNode(4);
        root.right.right.right = new BinaryTree.TreeNode(5);
        root.right.right.right.left = new BinaryTree.TreeNode(7);
        root.right.right.right.right = new TreeNode(6);

        System.out.println(minDepth(root));
    }

    private static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        if(root.left == null){
            return minDepth(root.right) +1 ;
        }

        if(root.right == null){
            return minDepth(root.left)+ 1;
        }

        int lh = minDepth(root.left);
        int rh = minDepth(root.right);

        return Math.min(lh,rh) +1;
    }
}
