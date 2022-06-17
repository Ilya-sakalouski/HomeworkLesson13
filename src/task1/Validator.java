package src.task1;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

import static src.task1.Reader.waysArray;

public class Validator {

    private static final String THIS_DOCUMENT_DON_T_START_WITH_DOCNUM_OR_KONTRACT = "  <- This document don't start with \"docnum\" or \"kontract\"";
    private static final String THIS_DOCUMENT_MEETS_THE_CONDITION = "  <- This document meets the condition.";
    public static HashSet<String> docHashSet = new HashSet<>();
    public static HashMap<String, String> docInfoHashMap = new HashMap<>();

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

                // System.out.println(document);  // Расскомментируй, для того, чтобы видеть содержимое файлов

                if (document.startsWith("docnum")) {          // валидация без спецсимволов(в условии нет)
                    docHashSet.add(document);
                    docInfoHashMap.put(document, THIS_DOCUMENT_MEETS_THE_CONDITION);
                } else if (document.startsWith("kontract")) {
                    docHashSet.add(document);
                    docInfoHashMap.put(document, THIS_DOCUMENT_MEETS_THE_CONDITION);
                } else {
                    docInfoHashMap.put(document, THIS_DOCUMENT_DON_T_START_WITH_DOCNUM_OR_KONTRACT);
                }
                document = br.readLine();
            }
            System.out.println();

        }

    }
    public static void hashSetToString(){
        for (String s : docHashSet) {
            System.out.println(s + "\n");
        }
    }
    public static void hashMapToString(){
        docInfoHashMap.entrySet().forEach(System.out::println);
    }
}


