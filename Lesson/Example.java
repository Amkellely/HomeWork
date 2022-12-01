package Lesson;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        final String inputFileName = "txt";
        final String outputFileName = "txt";
        try {
            fr = new FileReader(inputFileName);
            fw = new FileWriter(outputFileName, true);
            BufferedReader br = new BufferedReader(fr);
            int lineCounter = 1;
            String line = null;
            while ( (line = br.readLine()) != null){
                if(lineCounter++ %2 != 0){
                    fw.write(line + System.getProperty("line.separator"));
                }
            }
        }
        catch (FileNotFoundException ex){
            Logger.getLogger(Example.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        catch (IOException ex){
            Logger.getLogger(Example.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                fr.close();
                fw.close();
            }
            catch (IOException ex){
                Logger.getLogger(Example.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
