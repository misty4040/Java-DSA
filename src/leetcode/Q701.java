package leetcode;

public class Q701 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

    }

    public static TreeNode insertIntoBST(TreeNode root, int value) {
        return insert(root,value);

    }

    private static TreeNode insert(TreeNode root, int value) {
        if(root == null){
            return new TreeNode(value);
        }

        if(value>root.val){
            root.left = insert(root.left,value);
        }else{
            root.right = insert(root.right,value);
        }


        return root;
    }
}
