package OOPs;

abstract class misty{
    //abstract method
    abstract void sound();


    //concrete method
    void makesound() {
        System.out.println("hehe");
    }
}


class ExtendAbstract extends misty{
    void sound(){
        System.out.println("samr");
    }
}

class AbstractClasses {
    public static void main(String[] args) {

        ExtendAbstract kutti = new ExtendAbstract();
        kutti.sound();
        kutti.makesound();
    }
}
