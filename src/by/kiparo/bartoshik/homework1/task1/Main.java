package by.kiparo.bartoshik.homework1.task1;

public class Main {
    public static void main(String[] args) {
        String text = "Hello! My name is Vadim and i want to learn Java!!";
        printResult(text);
    }

    public static void printResult(String text) {
        System.out.println("Length = " + text.length());
        int middle = text.length() / 2;
        System.out.println("String1 = " + text.substring(0, middle));
        System.out.println("String2 = " + text.substring(middle));
    }
}
