package messageservice;

import java.io.*;

/**
 *
 * @author Brian Schrader
 */
public class FileInput implements MessageInput {

    private boolean lineReadFlag = false;

    @Override
    public String readln() {
        File data = new File(File.separator + "Temp" + File.separator + "data.txt");

        BufferedReader in = null;
        String message = null;

        try {
            if (data.exists()) {
		// make sure we differentiate between java.io.FileInput
                // class and this custom FileInput class
                in = new BufferedReader(new java.io.FileReader(data));
                message = in.readLine();
                in.close();
            } else {
                System.out.println("File not found - data.txt");
                message = null;
            }
        } catch (IOException ioe) {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe2) {
                System.out.println(ioe2.getMessage());
            }
            System.out.println(ioe.getMessage());
            System.exit(1);  // 1 = signals program end with error
        }

        // ugly hack so we can end the program after reading a message
        if (lineReadFlag) {
            return null;
        } else {
            lineReadFlag = true;
            return message;
        }
    }

    public void method2() {
        System.out.println("not a polymorphic method");
    }
}
