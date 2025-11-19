package TASK;

public class Task3 {
    private String string;
    public Task3(String string) {
        this.string = string;
    }
    public void display() {
        try {
            System.out.println(string.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("Enter a text");
        }
    }
}
