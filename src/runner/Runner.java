package src.runner;

import src.task1.Reader;
import src.task1.Validator;

import java.io.IOException;

public class Runner {
    /*
         src/resources/file1 file1
         src/resources/file2 file2
         src/resources/file3 file3
         */
    public static void main(String[] args) throws IOException {
        System.out.println("ENTER WAY TO FILE & IT'S NAME  through a space: ");

        Reader.read();
        System.out.println(Reader.scanArray);
        System.out.println(Reader.waysArray);
        System.out.println(Reader.namesArray);
        System.out.println(Reader.namesArray.size());    //  ПРОБЛЕМА ТУТ...

        Validator.readAndValidateFile();
        System.out.println(Validator.docHashSet);
    }
}
