package eyueksel;
/**
 *
 * @author Eren Nazim Yüksel
 * @version 2024-02-14
 */
public class StackFullException extends Exception{
    /**
     * Exception
     * @param text
     */
    public StackFullException (String text){
        super(text);
    }
}
