package TASK;

import TASK.CUSTOMEEXCEPTION.InvalidAgeException;

public class Task8 {
    private void methodThrowException() throws Exception {
        throw new Exception("this is a exception");
    }
    public void methodCallIt() throws Exception {
        methodThrowException();
    }
}
