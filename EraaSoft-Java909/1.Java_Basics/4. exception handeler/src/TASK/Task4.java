package TASK;

public class Task4 {
    private int index;
    public Task4(int index) {
        this.index = index;
    }
    private int[] array = {1,2,3,4,5};
    public void display() {
        try {
            System.out.println("Value = "+array[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
}
