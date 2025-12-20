package Revision;

import leetcode.ListNode;

public class ReverseLL {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        ListNode temp = rev(node);

        while(temp != null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    static ListNode reverse = new ListNode(0);
    static ListNode current = reverse;

    private static ListNode rev(ListNode node) {
        helper(node);
        return reverse.next;
    }

    private static void helper(ListNode node) {
        while(node == null){
            return;
        }

        helper(node.next);
        current.next = new ListNode(node.val);
        current = current.next;
    }
}
