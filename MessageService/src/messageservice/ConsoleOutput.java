package messageservice;

/**
 *
 * @author Brian Schrader
 */
public class ConsoleOutput implements MessageOutput {
    
    
    public void writeln( String message ) {
            System.out.println("Here is the text you entered, which I've copied below.");
            System.out.println(message );
	}
}
