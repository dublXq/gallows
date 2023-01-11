import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class Launcher {

    public int error;

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        // Создание трех объектов, классов Slovar, Scanner и TheMainGallows
        Slovar slovar_new = new Slovar();
        TheMainGallows theMainGallows = new TheMainGallows();
        Scanner scanner = new Scanner(System.in);
        char secondChar = '_';
        boolean isFalse = false;

        theMainGallows.mainMaps();
        int n = (int) Math.floor(Math.random() * Slovar.slovar.length);


        // Слово преоброзуется в массив букв
        char[] chars = Slovar.slovar[n].toUpperCase().toCharArray();

        // Количество букв преоброзуется в число и записывается в временную переменную
        int TIMES_INT = chars.length;

//        Рисуется "_" по количеству в переменной - TIMES_INT
        System.out.print("\nСлово: ");
        for (int i = 0; i < TIMES_INT; i++) {
            System.out.print(secondChar + " ");
        }

        //Вывод количества ошибок, которые допустил игрок
        System.out.println("\nОшибки: (" + launcher.error + ")");

        int i;
        for (i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }

        System.out.print("Буква: ");
        char firstNumb = scanner.next().toUpperCase().charAt(0);

        //Проверка на наличие буквы, в массиве символов
        for (int y = 0; y < chars.length; y++) {
            if (chars[y] == firstNumb)
                isFalse = true;
        }
        System.out.println(isFalse);
    }
}
