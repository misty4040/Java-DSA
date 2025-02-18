package DSA;

public class DeletionLL {

    private Node head;
    private Node tail;
    private int size;

    public DeletionLL() {
        this.size = 0;
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

    public void delete1(){
        head=head.next;
        size--;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public void deletelast(){
        Node sec=get(size-1);
        sec.next=null;
        tail=sec;
    }

    public void deletep(){
        Node temp=get(3);
        temp.next=temp.next.next;
        size--;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println("end");
    }

    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DeletionLL obj=new DeletionLL();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
        obj.display();
      //  obj.deletep();
        //obj.display();
        // obj.delete1();
  //      obj.display();
        obj.deletelast();
        obj.display();
//        System.out.println(obj.size);
    }
}
