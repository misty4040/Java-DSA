package leetcode;

public class RemoveNnodeFromEnd {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode first = dummy;
            ListNode second = dummy;

            // Move first pointer n+1 steps ahead (to get the gap)
            for (int i = 0; i <= n; i++) {
                first = first.next;
            }

            // Move both pointers until first reaches the end
            while (first != null) {
                first = first.next;
                second = second.next;
            }

            // Remove the nth node
            second.next = second.next.next;

            return dummy.next;
        }
    }
}
