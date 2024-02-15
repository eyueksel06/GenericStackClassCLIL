package eyueksel;

public class Stack <T> {
    private T[] list;
    private int elements = 0;

    public Stack() {
        this.list = (T[]) new Object[2];
    }
    public Stack(int fields) {
        this.list = (T[]) new Object[fields];
    }
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
    public T pop () throws StackEmptyException{
        if(list[0] == null){
            throw new StackEmptyException("The Stack is empty");
        }
        T element = list[elements-1];
        list[elements-1] = null;
        elements--;
        return element;
    }
    public T peek (){
        T element = null;
        for(int i = list.length-1; i > 0; i--){
            if(list[i] != null){
                element = list[i];
            }
        }
        return element;
    }
    public String list(){
        String text = "";
        for(int i = 0; i < elements; i++){
            text += list[i].toString()+"; ";
        }
        return text;
    }
}
