package leetcode;

public class Q98 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(1);

        System.out.println(isValidBST(root));
    }
    static TreeNode prev=null;
    static Boolean validate = true;
    private static boolean isValidBST(TreeNode root) {
        inorder(root);
        return validate;
    }


    private static void inorder(TreeNode root) {
        if(root == null){
            return;
        }

        inorder(root.left);
        if(prev!= null && prev.val<=root.val){
            validate= false;
        }
        prev = root;

        inorder(root.right);


    }
}
