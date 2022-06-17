package src.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
    public static List<String> scanArray = new ArrayList<>();   // WITH ENTER
    public static List<String> scanArray2 = new ArrayList<>();  // WITHOUT ENTER
    public static List<String> waysArray = new ArrayList<>();
    public static List<String> namesArray = new ArrayList<>();

    public static void read() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();

        while (!scan.equals("0")) {
            scanArray.add(scan);
            scan = scanner.nextLine();
        }
        scanArray.remove(scanArray.size() - 1);

        int index = 0;
        for (int i = 0; i < scanArray.size(); i++) {
            if (scanArray.indexOf(scanArray.get(i)) % 2 == 0) {
                scanArray2.add(index, scanArray.get(i));
                index++;
            }
        }

        Pattern pattern = Pattern.compile("^.*?\\s");
        for (String name : scanArray2) {
            Matcher matcher = pattern.matcher(name);
            while (matcher.find()) {
                String finalName = name.substring(matcher.start(), matcher.end());
                waysArray.add(finalName);
            }
        }

        for (String names : scanArray2) {
            String finalname2 = names.substring(names.indexOf(" ") + 1);
            namesArray.add(finalname2);
        }

        scanner.close();
    }
}
