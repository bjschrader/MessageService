package messageservice;

/**
 *
 * @author Brian Schrader
 */
public class MessageHandler {

    private MessageInput input;
    private MessageOutput output;
    private String message;

    public MessageHandler(MessageInput input, MessageOutput output) {
        this.input = input;
        this.output = output;
    }

    public void copy() {
        String message = input.readln();
        output.writeln(message);
    }

    public MessageInput getInput() {
        return input;
    }

    public void setInput(MessageInput input) {
        if(input == null){
            // notify user
        }
        this.input = input;
    }
    
    public void readLine(){
        message = input.readln();
        output.writeln(message);   
    }
    
    public void writeLine(){
        output.writeln(message);
    }

    public MessageOutput getOutput() {
        return output;
    }

    public void setOutput(MessageOutput output) {
        this.output = output;
    }

}
