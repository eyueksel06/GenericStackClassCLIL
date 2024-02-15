package eyueksel;

/**
 * A Stack-Storage Program
 * @author Eren Nazim Yüksel
 * @version 2024-02-14
 */
public class Stack <T> {
    private T[] list;
    private int elements = 0;  // The Number of elements saved in the list

    /**
     * Default Constructor with 2 fields of place to store objects
     */
    public Stack() {
        this.list = (T[]) new Object[2];
    }

    /**
     * Constructor with a parameter to choose the fields to store objects
     * @param fields
     */
    public Stack(int fields) {
        this.list = (T[]) new Object[fields];
    }

    /**
     * This method adds an element to the list
     * @param element
     * @throws StackFullException
     */
    public void push (T element) throws StackFullException{
        for(int i = 0; i < list.length; i++){
            if(list[i] == null){
                list[i] = element;
                break;
            }
        }
        elements++;
        if(elements > list.length){
            throw new StackFullException("Stack is full");
        }
    }

    /**
     * This method deletes the last element added to the list
     * @return the element that got deleted
     * @throws StackEmptyException
     */
    public T pop () throws StackEmptyException{
        if(list[0] == null){
            throw new StackEmptyException("The Stack is empty");
        }
        T element = list[elements-1];
        list[elements-1] = null;
        elements--;
        return element;
    }

    /**
     * This method returns the last element added
     * @return the las element added
     */
    public T peek (){
        T element = null;
        for(int i = list.length-1; i > 0; i--){
            if(list[i] != null){
                element = list[i];
            }
        }
        return element;
    }

    /**
     * Returns a String of the list with all the bóbjects stored selperated by a semicolon (;)
     * @return
     */
    public String list(){
        String text = "";
        for(int i = 0; i < elements; i++){
            text += list[i].toString()+"; ";
        }
        return text;
    }
}
