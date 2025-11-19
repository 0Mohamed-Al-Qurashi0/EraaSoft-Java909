import java.io.IOException;
import java.util.Scanner;
import java.lang.*;
import TASK.*;
import TASK.CUSTOMEEXCEPTION.InvalidAgeException;

public class Main {
    public static <e> void main(String[] args){
        Scanner input = new Scanner(System.in);
        //task 1
        /*int num1 = input.nextInt();
        int num2 = input.nextInt();
        Task1 task1 = new Task1(num1, num2);
        task1.display();*/
        //task 2
        /*String str = input.next();
        Task2 task2 = new Task2(str);
        task2.display();*/
        //task 3
        /*String str1 = "Mohamed";
        String str2 = null;
        Task3 task3 = new Task3(str1);
        task3.display();
        task3 = new Task3(str2);
        task3.display();*/
        //task 4
        /*int index = input.nextInt();
        Task4 task4 = new Task4(index);
        task4.display();*/
        //task 5
        /*String path = input.nextLine();
        Task5 task5 = new Task5(path);
        task5.display();*/
        //task 6
        /*int num1 = input.nextInt();
        Integer num2 =  input.nextInt();
        Task6 task6 = new Task6(num1,num2);
        task6.display();
        System.out.println("\nwhen number 2 = null");
        num2 = null;
        task6 =  new Task6(num1,num2);
        task6.display();*/
        //task 7
        /*int age = input.nextInt();
        Task7 task7 = new Task7(age);
        try {
            task7.checkAge();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }*/
        //task 8
        /*Task8 task8 = new Task8();
        try {
            task8.methodCallIt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
        //task 9
        /*Task9 task9 = new Task9();
        try {
            task9.readFile();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }*/
        //task 10
        /*Task10 task10 = new Task10(5,0);
        System.out.println("show that the finally block always executes.");
        System.out.println("-----------------------------------------------------\nwhen exception");
        task10.display();
        task10 = new Task10(5,5);
        System.out.println("-----------------------------------------------------\nwhen no exception");
        task10.display();*/
        //task 11
        /*try {
            try {
                System.out.println(5/0);
            }catch (IndexOutOfBoundsException e){}
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }*/
    }
}