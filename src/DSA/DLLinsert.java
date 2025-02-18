package DSA;

public class DLLinsert {

    private Node head;
    private Node tail;

    void inserthead(int value){
       Node node=new Node(value);
       node.next=head;
       node.prev=null;
       if(head!=null){
           head.prev=node;
       }
       head=node;
    }

    void insert1(int value){
        Node node=new Node(value);
        if(head!=null) {
            head.prev = node;
        }
            node.next = head;
            head = node;
    }

    void insertlast(int value){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        Node node=new Node(value);
        last.next=node;
        node.prev=last;
        node.next=null;
    }

    void insertp(int value,int index){
        Node temp=head;
        for(int i=1;i<index-1;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next,temp);
        temp.next=node;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
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
        DLLinsert obj=new DLLinsert();
        obj.inserthead(10);
        obj.inserthead(20);
        obj.inserthead(30);
        obj.inserthead(40);
        obj.display();
        obj.insert1(50);
        obj.display();
        obj.insertlast(60);
        obj.display();
        obj.insertp(80,4);
        obj.display();
    }
}
