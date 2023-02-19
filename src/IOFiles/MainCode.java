package IOFiles;

import static IOFiles.Main.in;
import static IOFiles.ValidationFile.validation;
import static IOFiles.WriteFile.writeFile;
import static IOFiles.ReadFile.readFile;

public class MainCode {

    static void listenClient() {
        for (; ; ) {
            System.out.print("Введите 1 для поиска, 2 для сохранения и 'выход' для выхода: ");
            String searchType = in.nextLine();
            if (searchType.equals("1")) {
                System.out.print("Введите путь для поиска c именем файла: ");
                String dir = in.nextLine();
                if (validation(dir)) {
                    readFile(dir);
                } else {
                    continue;
                }
            }
            if (searchType.equals("2")) {
                System.out.print("Введите путь для сохранения c именем файла: ");
                String dir = in.nextLine();
                if (!validation(dir)) {
                    continue;
                }
                System.out.print("Введите содержимое файла: ");
                String text = in.nextLine();
                if (!validation(text)) {
                    continue;
                }
                writeFile(dir, text);
            }
            if (searchType.equalsIgnoreCase("выход")) {
                break;
            }
        }
    }
}
