/**
 * Created by Александр on 17.11.2014.
 */
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = new Random().nextInt(100) + 1;

        System.out.println("Отгадайте число от 1 до 100 \nВведие число: ");

        while (true) {
            int i = sc.nextInt();
            if (i == number) {
                System.out.println("You Win!");
                return;
            }
            if (i > number) System.out.println("Задуманное число меньше");
            else System.out.println("Задуманное число больше");
        }
    }
}
