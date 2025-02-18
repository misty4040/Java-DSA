package Stack1;

public class CustomStack {
    protected int[] data;
    public static final int DEFAULT_SIZE =10;

    public CustomStack() {
      this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    int ptr= -1;

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("bkl");
        }
        return data[ptr--];
    }


    public boolean isFull() {
      return ptr==data.length-1;
    }

   public boolean isEmpty() {
        return ptr==-1;
    }
}
