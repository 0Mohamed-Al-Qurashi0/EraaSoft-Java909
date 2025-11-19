package TASK;
import TASK.CUSTOMEEXCEPTION.InvalidAgeException;

public class Task7 {
    private int age;

    public Task7(int age) {
        this.age = age;
    }

    public void checkAge() throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age");
        } else {
            System.out.println("Age = " + age);
        }
    }
}
