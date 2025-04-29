package leetcode;

public class Q876 {
    public static void main(String[] args) {
       ListNode head = new ListNode(1);
       head.next=new ListNode(2);
       head.next.next=new ListNode(3);
       head.next.next.next=new ListNode(4);
       head.next.next.next.next=new ListNode(5);

       ListNode res=middleNode(head);
       while(res!=null){
           System.out.println(res.val+" ");
           res=res.next;
       }
    }

    private static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast = head;

        while(fast.next != null && fast != null){
            slow=slow.next;
            fast=fast.next.next;
        }
            return slow;
        }
    }
