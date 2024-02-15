package eyueksel;

import java.nio.channels.ScatteringByteChannel;

public class Main {
    public static void main (String args[]) throws StackFullException {
        var stringStack = new Stack<String>(5);
        var intStack = new Stack<Integer>();
        try{
            stringStack.push("a");
            stringStack.push("b");
            stringStack.push("c");
            stringStack.push("d");
            stringStack.push("e");
            // stringStack.push("f");

            intStack.push(1);
            intStack.push(2);

            System.out.println("stringStacklist: "+stringStack.list());
            System.out.println("intStacklist: "+intStack.list());

            System.out.println("First deleted Element of the stringStack: "+stringStack.pop());
            stringStack.pop();
            stringStack.pop();
            stringStack.pop();
            // stringStack.pop();
            // stringStack.pop();

            System.out.println("First deleted Element of the intStack: "+intStack.pop());

            System.out.println("New stringStacklist: "+stringStack.list());
            System.out.println("New intStacklist: "+intStack.list());

        }catch(StackFullException | StackEmptyException e){
            e.printStackTrace();
        }
    }

}
