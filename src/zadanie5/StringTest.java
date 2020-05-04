package zadanie5;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class StringTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Początek zabawy");
        System.out.println("Podaj napis: ");
        String first = scan.nextLine();

        String second;
        boolean endGame;

        do {
            System.out.println("Podaj napis: ");
            second = scan.nextLine();
            if (second.equals(first)) {
                endGame = false;
            } else {
                endGame = true;
                first = second;
            }
        } while (endGame);
        System.out.println("Koniec zabawy");
    }
}
