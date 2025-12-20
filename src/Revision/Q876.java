package Revision;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}
public class Q876 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next =  new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node ans =  middleNode(head);

        while (ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

    private static Node middleNode(Node head) {
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int mid= count/2;

        for(int i=0;i<mid;i++){
            head = head.next;
        }

        return head;
    }

}
