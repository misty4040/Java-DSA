package leetcode;

public class Q234 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
//        head.next.next=new ListNode(2);
//        head.next.next.next=new ListNode(1);

        System.out.println(isPalindrome(head));
    }

    static ListNode rev = new ListNode(0);
    static ListNode curr =rev;

    private static boolean isPalindrome(ListNode head) {
        boolean ans=false;
        helper(head);
        rev = rev.next;
        while(head!=null) {
            if (head.val == rev.val) {
                ans = true;
            } else {
                ans = false;
                break;
            }
            head = head.next;
            rev = rev.next;
        }
        return ans;
    }

    private static void helper(ListNode head) {
        if(head == null){
            return;
        }
        helper(head.next);
        curr.next = new ListNode(head.val);
        curr = curr.next;
    }


}
