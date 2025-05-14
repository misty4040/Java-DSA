package OOPs;

interface lpu{
    void get_regno();

    static void greeting(){
        System.out.println("Hello from Interface static ");
    }

    default void greeting2(){
        System.out.println("Hello from Interface default");
    }
}

class ExtenedInterface implements lpu{
    public void get_regno(){
        System.out.println(12322907);
    }

    public void get_name(){
        lpu.greeting();//static method calling from interface
        greeting2();//default method calling from interface
        System.out.println("Misty");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        ExtenedInterface misty = new ExtenedInterface();
        misty.get_name();
        misty.get_regno();
    }
}
