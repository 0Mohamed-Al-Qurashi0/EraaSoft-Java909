package TASK.CUSTOMEEXCEPTION;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String ouput) {
        super(ouput);
    }
}