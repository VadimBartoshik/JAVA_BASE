package by.kiparo.bartoshik.homework1.task3;

public class Main {
    public static void main(String[] args) {
        int money = 121;
        int lastNumber = money % 10;
        printResult(money,lastNumber);
    }

    public static void printResult(int money, int lastNumber) {
        switch (lastNumber) {
            case 0:
                System.out.println(money + " рублей");
                break;
            case 1:
                System.out.println(money + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(money + " рубля");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(money + " рублей");
                break;
        }
    }
}
