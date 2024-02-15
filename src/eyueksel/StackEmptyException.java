package eyueksel;
/**
 *
 * @author Eren Nazim Yüksel
 * @version 2024-02-14
 */
public class StackEmptyException extends Exception{
    /**
     * Exception
     * @param text
     */
    public StackEmptyException (String text){
        super(text);
    }
}
