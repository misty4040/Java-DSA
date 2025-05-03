package Revision;

import java.util.Scanner;

interface Animal{
    void makeSound();
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("bark");
    }
}

class Cat implements Animal{
    public void makeSound(){
        System.out.println("meow");
    }
}

public class InterfaceQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Dog d= new Dog();
        Cat c=new Cat();

        if(name.equalsIgnoreCase("Dog")){
           d.makeSound();
        }else{
           c.makeSound();
        }


    }
}
