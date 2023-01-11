import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class Launcher {


    public static void main(String[] args) {

        // Создание трех объектов, классов Slovar, Scanner и TheMainGallows
        Slovar slovar_new = new Slovar();
        TheMainGallows theMainGallows = new TheMainGallows();
        Scanner scanner = new Scanner(System.in);
//        theMainGallows.mainMaps();
        int n = (int) Math.floor(Math.random() * Slovar.slovar.length);
        char[] chars = Slovar.slovar[n].toCharArray();
        System.out.println(chars);
        char secondChar = '_';
        int TIMES_INT = chars.length;
        System.out.print("\nСлово: ");
        for (int i = 0; i < TIMES_INT; i++) {
            System.out.print(secondChar + " ");
        }

        System.out.println("\nОшибки: (" + ")");
        System.out.print("Буква: ");
//        char firstNumb = scanner.next().charAt(0);

        int i;
        for (i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
//        if (firstNumb <= chars[i]) {
//            System.out.println(i);
//        }
        System.out.println("\n");
        theMainGallows.mainMapsSecond();
        System.out.println("\n");
        theMainGallows.mainMapsThree();
        System.out.println("\n");
        theMainGallows.mainMapsFor();
        System.out.println("\n");
        theMainGallows.mainMapsFive();
        System.out.println("\n");
        theMainGallows.mainMapsSix();
        System.out.println("\n");
        theMainGallows.mainMapsSeven();
    }
}
