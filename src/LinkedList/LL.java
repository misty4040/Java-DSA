package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size =0;
    }

    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void insert1(int value){
       Node node= new Node(value);
       node.next=head;
       head=node;
    }

    public void insertlast(int value){
        Node node=new Node(value);
        tail.next=node;
        tail=node;
    }

    public void insertpos(int value,int index){
        if(head==null){
            insert(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;

    }

    public void insertCyclic(int value){
        Node node=new Node(value);
        if(head==null) {
            head = node;
            tail = node;
        }else{
            tail.next=node;
            node.next=head;
            tail=node;
        }
        size++;
    }

    public void display(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
            count++;
            if(count==size){
                break;
            }

        }
        System.out.println("END");
    }

    public void deleteduplicate(){
        Node temp=head;
        while(temp.next!=null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public class Node{
       int value;
       Node next;

       public Node(int value){
           this.value=value;
       }

       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
   }

    public static void main(String[] args) {
        LL obj= new LL();
        obj.insert(10);
        obj.insert(20);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.display();
      //  obj.insertpos(60,2);
        //obj.display();
        obj.deleteduplicate();
        obj.display();
    }

}
