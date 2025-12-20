package leetcode;

import BinaryTree.TreeNode;

public class Q104 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(maxDepth(root));
    }

    private static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int lheight = maxDepth(root.left);
        int rheight = maxDepth(root.right);

        return Math.max(lheight,rheight) +1;
    }


}
