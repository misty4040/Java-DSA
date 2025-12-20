package leetcode;

public class Q206 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode temp = reverseList(node);
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    static ListNode reverse = new ListNode();
    static ListNode curr = reverse;
    private static ListNode reverseList(ListNode head) {
        recur(head);
        return reverse.next;
    }

    private static void recur(ListNode node) {
        if(node == null){
            return;
        }

        recur(node.next);
        curr.next = new ListNode(node.val);
        curr = curr.next;
    }
}
