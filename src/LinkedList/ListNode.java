package LinkedList;

public class ListNode {
    int val ;
    leetcode.ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, leetcode.ListNode next) {
        this.val = val;
        this.next = next;
    }
}
