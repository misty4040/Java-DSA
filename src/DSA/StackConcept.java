package DSA;
import java.util.*;

public class StackConcept {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        Stack<Integer> stack=new Stack<>();
        for(int i:arr){
            stack.push(i);
        }

        int remove=stack.pop();
        System.out.println(remove);

        System.out.println(stack.peek());
    }

}
