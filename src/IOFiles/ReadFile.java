package IOFiles;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    static void readFile(String dir) {
        try (FileReader reader = new FileReader(dir)) {
            System.out.println("Содержимое вашего файла: ");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println("чтение файло не удалось: " + ex.getMessage());
        }
    }
}
