package DSA;

public class DoublyLL {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }

    void inserthead(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            last=temp;
            temp=temp.next;

        }

        System.out.println("end");

        while(last!=null){
            System.out.print(last.value+" -> ");
           last=last.prev;

        }
        System.out.println("end");
    }

    public class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DoublyLL obj=new DoublyLL();
        obj.inserthead(10);
        obj.inserthead(20);
        obj.inserthead(30);
        obj.inserthead(40);
        obj.display();
    }
}




