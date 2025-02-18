package leetcode;

public class Q21 {
    private Node head;
    private Node tail;
    private int size;

    public Q21() {
        this.size = 0;
    }

    public static Q21 mergeTwoLists(Q21 first, Q21 second){
        Node f=first.head;
        Node s= second.head;
        Q21 third=new Q21();
        while(f!=null && s!=null){
            if(f.value<s.value){
                third.insert(f.value);
                f=f.next;
            }else{
                third.insert(s.value);
                s=s.next;
            }
        }

        while(f!=null){
            third.insert(f.value);
            f=f.next;
        }

        while(s!=null){
            third.insert(s.value);
            s=s.next;
        }
        return third;
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
    }

    public void display(){
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

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Q21 first=new Q21();
        Q21 second= new Q21();
        first.insert(1);
        first.insert(3);
        first.insert(4);
        second.insert(1);
        second.insert(2);
        second.insert(4);
        Q21 ans= mergeTwoLists(first,second);
        ans.display();
    }
}

