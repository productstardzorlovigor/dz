package IOFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    static void writeFile(String dir, String text) {
        File file = new File(dir);
        if (file.exists()) {
            System.out.println("!!! Файл будет перетерт !!!");
        }
        try (FileWriter writer = new FileWriter(dir, false)) {
            long start = System.currentTimeMillis();
            writer.write(text);
            writer.flush();
            long finish = System.currentTimeMillis();
            System.out.println("запись файла заняла: " + (finish - start) + " миллисекунд");
            File currentFile = new File(dir);
            if (currentFile.exists()) {
                System.out.println("файл весит: " + currentFile.length() + " байта");
            } else {
                System.out.println("запись не удалась:");
            }
        } catch (IOException ex) {
            System.out.println("запись не удалась: " + ex.getMessage());
        }

    }
}
