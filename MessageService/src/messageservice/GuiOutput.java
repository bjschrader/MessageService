package messageservice;

import javax.swing.JOptionPane;
/**
 *
 * @author Brian Schrader
 */
public class GuiOutput implements MessageOutput {
    
    
            @Override
    	public void writeln( String message ) {
            JOptionPane.showMessageDialog(null, message);
	}
}
