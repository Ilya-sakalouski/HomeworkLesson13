package src.task1;


import java.io.*;
import java.util.HashSet;

import static src.task1.Reader.waysArray;

public class Validator {

    public static HashSet<String> docHashSet = new HashSet<>();

    public static void readAndValidateFile() throws IOException {
        for (String s : waysArray) {
            File file = new File(s);

            FileReader fr;
            try {
                fr = new FileReader(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            BufferedReader br = new BufferedReader(fr);

            String document = br.readLine();

            while (document != null) {

                System.out.println(document);  // чисто для того, чтобы видеть содержимое файлов

                if ((document.startsWith("docnum") || document.startsWith("kontract"))) {  // валидация без спецсимволов(в условии нет)
                    docHashSet.add(document);
                }
                document = br.readLine();
            }
            System.out.println("\n");
        }
    }
}


