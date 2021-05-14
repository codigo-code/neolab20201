package excepciones.caso3;


import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class PipingExceptionMain {

    public static void main(String args[]) {

        // Sin piping
        try {
            File file = new File("C:\\test.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileAlreadyExistsException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Uso de piping (Java 7)
        try {
            File file = new File("C:\\test.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        } catch (FileNotFoundException|FileAlreadyExistsException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
