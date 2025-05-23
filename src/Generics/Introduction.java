package Generics;

class Box<T>{
    private T value;

    public void set(T value){
        this.value=value;
    }

    public T get(){
        return value;
    }
}

public class Introduction {
    public static void main(String[] args) {
        Box<String> var=new Box<>();
        var.set("Misty");
        System.out.println(var.get());
    }
}
