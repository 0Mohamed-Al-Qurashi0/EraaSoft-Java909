package TASK;

public class Task1 {
    private  int num1;
    private  int num2;
    public Task1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void display() {
        try {
            System.out.println("The dividend as integer is: " + num1/num2);
        }catch (ArithmeticException e){
            System.out.println("Can't division by zero");
        }
    }
}
