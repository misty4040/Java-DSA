package GFG;

import BinaryTree.TreeNode;

public class CeilInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);

        System.out.println(findCeil(root,3));
    }

    static int ans;
    private static int findCeil(TreeNode root, int key) {
        ans=-1;
        inorder(root,key);
        return ans;
    }

    private static void inorder(TreeNode root, int key) {
        if(root==null){
            return;
        }
        inorder(root.left, key);
        if(root.val >= key && ans == -1){
            ans=root.val;
            return;
        }
        inorder(root.right,key);
    }
}
