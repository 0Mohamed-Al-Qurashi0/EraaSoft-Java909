package TASK;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task9 {
    public void readFile()throws IOException {
        File file = new File("test.txt");
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            String line = read.nextLine();
            System.out.println(line);
        }
        read.close();
    }
}
