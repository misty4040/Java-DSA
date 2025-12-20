package leetcode;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }

}

public class Q230 {

        public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(1);
        node.right = new TreeNode(4);
        node.left.right = new TreeNode(2);

        System.out.println(kthSmallest(node,3));

    }

    private static int kthSmallest(TreeNode root, int k) {
            inorder(root,k);
            return ans;
    }

        static int count=0;
        static int ans=0;

    private static void inorder(TreeNode root, int k) {
           if(root == null){
               return;
           }
           inorder(root.left,k);
           count++;
           if(count == k){
               ans=root.val;
           }
           inorder(root.right,k);


    }


}
