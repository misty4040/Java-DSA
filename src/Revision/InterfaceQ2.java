package Revision;

import java.util.Scanner;

interface Vehicle{
    void start();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike is starting");
    }
}

public class InterfaceQ2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String type=in.nextLine();
        Vehicle v;

        if(type.equalsIgnoreCase("car")){
            v=new Car();
        }else{
            v= new Bike();
        }

        v.start();
    }
}
