package messageservice;

import java.io.*;

/**
 *
 * @author Brian Schrader
 */
public class FileOutput implements MessageOutput {

    @Override
    public void writeln(String line) {
        boolean append = false;
        File data = new File(File.separatorChar + "Temp"
                + File.separatorChar + "datacopy.txt");
        PrintWriter out = null;
        
        try {
			
			out = new PrintWriter(
						new BufferedWriter(
						new java.io.FileWriter(data, append) ) );
			out.println(line);
			out.close();
			
		} catch (IOException ioe) {
			if(out != null) out.close();
			System.out.println( ioe.getMessage() );
			System.exit(1);  // 1 = signals program end with error
		}
    }
}
