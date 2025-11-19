package TASK;
import java.io.*;
public class Task5 {
    private String path;
    public Task5(String path) {
        this.path = path;
    }
    public void display() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
