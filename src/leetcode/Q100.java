package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q100 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
//        node1.right = new TreeNode(3);

        TreeNode node2 = new TreeNode(1);
//        node2.left = new TreeNode(2);
        node2.right = new TreeNode(2);

        System.out.println(isSameTree(node1,node2));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }

        if(p == null || q==null ||p.val !=q.val){
            return false;
        }

        return isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);

    }



}
