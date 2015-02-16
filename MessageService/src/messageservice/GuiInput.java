package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian Schrader
 */
public class GuiInput implements MessageInput {
    
    private String message;

    @Override
    public String readln() {
        JOptionPane.showInputDialog(message);
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   
}
