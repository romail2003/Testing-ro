package sample;

public class Main {

    public static void main(String[] args) {
        int a = 45;
        int x = switch (a) {
            case 1, 2, 3 -> 12;
            case 5, 6, 45 -> 2;
            default -> 69;
        };

        System.out.println(x);
    }
}
