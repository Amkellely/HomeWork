package Lesson;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example4 {
    public static void main(String[] args) {
        static String lineSepartor = System.getProperty("line.separator");
        try (
                FileInputStream fis = new FileInputStream("lines1251.txt");
                InputStreamReader isr = new InputStreamReader(fis,"windows-1251");
                FileOutputStream fos = new FileOutputStream("txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                BufferedWriter bw = new BufferedWriter(osw);
        )
        {
            String line = "";
            while ((line = br.readLine()) != null){
                System.out.print(line);
                bw.write(line + lineSepartor);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
