package messageservice;

import java.util.Scanner;
/**
 *
 * @author Brian Schrader
 */
public class KeyboardInput implements MessageInput {
    
    

    @Override
    public String readln() {
        System.out.println("Type your message here then press enter:");

            Scanner keyStrokes = new Scanner(System.in);
            return keyStrokes.nextLine();
    }

    
}
