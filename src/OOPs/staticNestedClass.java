package OOPs;


//static doesn't needs a obj to be created
//it increases encapsulation(DATA HIDING)


class outer{
    static class nested{
        void display(){
            System.out.println("hihihihi");
        }
    }
}

class outer1{
    static class nested1{
        static  String message="misty";
        static void showMessage(){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
//        nested1 nes=new nested1();
//        nes.showMessage();
        outer1.nested1.showMessage();
    }
}

public class staticNestedClass {
    public static void main(String[] args) {
//        outer.nested nested=new outer.nested();
//        nested.display();

    }
}

