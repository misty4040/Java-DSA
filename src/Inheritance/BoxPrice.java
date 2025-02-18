package Inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        this.cost=-1;

    }

    BoxPrice(BoxPrice other){
        //super(other);
        cost=other.cost;
    }

    public BoxPrice(double side,double weight,double cost){
        super(side,weight);
        this.cost=cost;
    }
}
