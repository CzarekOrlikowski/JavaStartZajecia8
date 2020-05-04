package zadanie1;

import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Scanner;

public class FruitTest {
    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[3];
        fruits[0] = Fruit.fruitCreator();
        int index = 1;

        do {
            Fruit newFruit = Fruit.fruitCreator();
            if (newFruit.equals(fruits[index - 1])) {
                System.out.println("Owoc już istnieje, podaj inny");
                } else {
                fruits[index] = newFruit;
                index++;
            }
        } while (index < fruits.length);

        System.out.println(Arrays.toString(fruits));
    }
}