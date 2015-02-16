package messageservice;

/**
 *
 * @author Brian Schrader
 */
public class Driver {

    public static void main(String[] args) {
        
        MessageInput input = new FileInput();
        MessageOutput output = new FileOutput();
        
        MessageInput kbinput = new KeyboardInput();
        MessageOutput guioutput = new GuiOutput();
        MessageHandler handler = new MessageHandler(kbinput, guioutput);
        
        handler.copy();
        
        handler.setOutput(output);
        handler.writeLine();
        
        
        
        	MessageHandler message = new MessageHandler( input, output );
		message.copy();
		
		// Send end of program message
		System.out.println("Program ended. Line of reader input copied successfully to writer output.");
        
    }
}
