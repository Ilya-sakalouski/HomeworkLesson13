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
        System.out.println("ENTER WAY TO FILE & IT'S NAME  THROUGH A SPACE:");

        Reader.read();
        System.out.println(Reader.scanArray + "  <- ScanArray with ENTER");
        System.out.println(Reader.scanArray.size() + "  <- ScanArray with ENTER (SIZE)");
        System.out.println(Reader.scanArray2 + "  <- ScanArray without ENTER");
        System.out.println(Reader.scanArray2.size() + "  <- ScanArray without ENTER (SIZE)");
        System.out.println(Reader.waysArray + "  <- Array of WAYS to files");
        System.out.println(Reader.namesArray + "  <- Array of NAMES of files");
        System.out.println(Reader.namesArray.size() + "  <- Array of NAMES (SIZE)");

        Validator.readAndValidateFile();
        System.out.println("HashSet of DOCUMENTS:");
        Validator.hashSetToString();
        System.out.println("HashMap of DOCUMENTS:");
        Validator.hashMapToString();
    }
}
