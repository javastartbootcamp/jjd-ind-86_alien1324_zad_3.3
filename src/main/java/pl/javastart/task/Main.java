package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Operations operations = new Operations();
        int x = 12;
        System.out.println(x + " Parzysta: " + operations.isEven(x));
        System.out.println(x + " Nieparzysta: " + operations.isOdd(x));
        System.out.println("Pole koła o promieniu " + x + ": " + operations.circleField(x));
        System.out.println(x + " do kwadratu: " + operations.power(x));
    }
}