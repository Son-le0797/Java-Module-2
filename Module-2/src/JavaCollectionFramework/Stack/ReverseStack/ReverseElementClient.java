package JavaCollectionFramework.Stack.ReverseStack;

import JavaCollectionFramework.Stack.ReverseStack.ReverseElement;

import java.util.Stack;

public class ReverseElementClient {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        wStack.push(12);
        wStack.push(24);
        wStack.push(36);
        wStack.push(48);
        wStack.push(60);
        wStack.push(72);
        wStack.push(84);
        wStack.push(96);


        System.out.println("Array list: ");
        for(int i = 0; i < wStack.size();i++){
            System.out.print(wStack.get(i)+"\t");
        }

        



//        for(int i = 0; i< element.size(); i++){
//            System.out.print();
//        }
//
//        System.out.println("Display the list: " + );
    }
}
