package Revision;

public class sammy {

    class superClass {
        void display() {
            System.out.println("sammy");
        }
    }

    class subClass {
        void display() {
            System.out.println("misty");
        }
    }

    public static void main(String[] args) {
        sammy outer = new sammy(); // Create outer class instance
        subClass obj = outer.new subClass(); // Create inner class instance
        obj.display(); // Call display method
    }
}