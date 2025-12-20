package leetcode;

public class Q148 {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

       ListNode temp =sortList(head);
       while(temp!=null){
           System.out.println(temp.val + " ");
       }
    }

    private static ListNode sortList(ListNode head) {
        ListNode temp = head;
        while(temp!=null){//2 4
            ListNode prev = temp;
            if(temp.val > temp.next.val){
                temp =temp.next;
                temp.next = prev;
            }
            temp = temp.next;
        }
        return head;
    }
}
