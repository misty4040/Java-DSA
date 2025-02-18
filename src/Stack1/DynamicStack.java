package Stack1;

public class DynamicStack extends CustomStack {
    protected int[] data;
    private static final int size=10;

    public DynamicStack() {
        this(size);
    }

    public DynamicStack(int size) {
        this.data = new int[size];
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            int[] temp= new int[data.length*2];
           for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
           data=temp;
        }
        return super.push(item);
    }
}
