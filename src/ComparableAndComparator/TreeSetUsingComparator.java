package ComparableAndComparator;

import java.util.Comparator;
import java.util.TreeSet;

class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }
     public String toString(){
        return name;
     }
}

public class TreeSetUsingComparator {
    public static void main(String[] args) {
        Comparator<Animal> set = new Comparator<Animal>(){
            public int compare(Animal a1,Animal a2){
                return a1.name.compareTo(a2.name);
            }
        };

        TreeSet<Animal> var = new TreeSet<>(set);
        var.add(new Animal("dog"));
        var.add(new Animal("cat"));

        for(Animal a: var){
            System.out.println(a);
        }

    }
}
