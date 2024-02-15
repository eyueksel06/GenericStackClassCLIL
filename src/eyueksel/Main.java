package eyueksel;
public class Main {
    /**
     *
     * @author Eren Nazim Yüksel
     * @version 2024-02-14
     */
    public static void main (String args[]) throws StackFullException {
        var stringStack = new Stack<String>(5);   // A generic String variable
        var intStack = new Stack<Integer>();    // A generic Integer variable
        try{
            stringStack.push("a");   // Pushing String elements to the list
            stringStack.push("b");
            stringStack.push("c");
            stringStack.push("d");
            stringStack.push("e");
            // stringStack.push("f");       // If pushed StackFullException occurs

            intStack.push(1);       // Pushing Integer Elements
            intStack.push(2);

            System.out.println("stringStacklist: "+stringStack.list());
            System.out.println("intStacklist: "+intStack.list());

            System.out.println("First deleted Element of the stringStack: "+stringStack.pop());  // Deleting the last element added and printing it out
            stringStack.pop();
            stringStack.pop();
            stringStack.pop();
            // stringStack.pop();   // If deleted the stringStack.list() method doesnt return anything
            // stringStack.pop();   // If deleted StackEmptyException occurs

            System.out.println("First deleted Element of the intStack: "+intStack.pop());

            System.out.println("New stringStacklist: "+stringStack.list());
            System.out.println("New intStacklist: "+intStack.list());

        }catch(StackFullException | StackEmptyException e){
            e.printStackTrace();
        }
    }

}
