package TASK;

public class Task6 {
    private  int num1;
    private  Integer num2;
    public Task6(int num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void display() {
        try {
            System.out.println("The dividend as integer is: " + num1/num2);
        }catch (NullPointerException e){
            System.out.println("Please enter a integer");
        }catch (ArithmeticException e){
            System.out.println("Can't division by zero");
        }
    }
}
