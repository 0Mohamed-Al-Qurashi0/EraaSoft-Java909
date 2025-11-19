package TASK;

public class Task2 {
    private String string_num;
    public Task2(String string_num) {
        this.string_num = string_num;
    }
    public void display() {
        try {
            System.out.println("Your number = "+Integer.parseInt(string_num));
        }catch (NumberFormatException e){
            System.out.println("Enter correct number");
        }
    }
}
