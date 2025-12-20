package OOPs;

//Non static Inner Class

class out{
    int x=10;
    class in{
        void display(){
            System.out.println(x);
        }
    }
};




//Local Inner Class

//whn we need a class which runs for only one instance

//class out{
//   void Local(){
//       class in{
//           void display(){
//               System.out.println("misty");
//           }
//       }
//       in obj=new in();
//       obj.display();
//   }
//}


//Anonymous Class

//a class without a name

abstract class Animal{
    abstract void display();
}

public class NonStaticInnerClass {
    public static void main(String[] args) {

//        Inner class

//        out obj=new out();
//        out.in obj2=obj.new in();
//        obj2.display();

//        Local Inner Class
//        out obj =new out();
//        obj.Local();

//        anonymous class
        Animal obj=new Animal() {
            @Override
            void display() {
                System.out.println("aryan");
            }
        };

        obj.display();
    }
}
