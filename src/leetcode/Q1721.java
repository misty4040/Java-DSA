package leetcode;

public class Q1721 {
    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(9);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(5);

        ListNode temp = swapNodes(head,5);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp =temp.next;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;

        ListNode first = head;
        ListNode last = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
            for (int i = 1; i < count - k + 1; i++) {
                last = last.next;
            }

        int var =first.val;
        first.val = last.val;
        last.val = var;

        return head;
    }
}
