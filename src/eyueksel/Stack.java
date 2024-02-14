package eyueksel;

public class Stack <T> {
    private T[] list;

    public Stack() {
        this.list = (T[])new Object[10];
    }
    public Stack(int fields) {
        this.list = (T[])new Object[fields];
    }
    public void push (T element){
        for(int i = 0; i < list.length; i++){
            if(list[i] == null){
                list[i] = element;
            }
        }
    }
    public T pop (){
        T element = null;
        for(int i = list.length-1; i > 0; i--){
            if(list[i] != null){
                element = list[i];
                list[i] = null;
            }
        }
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
        for(int i = 0; i < list.length; i++){

        }
        return text;
    }
}
