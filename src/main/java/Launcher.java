
import java.util.Random;
import java.util.Scanner;


/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */

public class Launcher {

    // Количество ошибок
    public static int error;

    // Слово преоброзуется в массив букв
    public static char[] chars = getChars();

    // Количество букв преоброзуется в число и записывается в временную переменную
    public static int TIMES_INT = chars.length;
    public static StringBuilder secondString = new StringBuilder();
    public static boolean isFalse = false;
    public static String s = "";

    public static void main(String[] args) {

        // Создание двух объектов, классов, Scanner и TheMainGallows

        TheMainGallows theMainGallows = new TheMainGallows();
        Scanner scanner = new Scanner(System.in);

        char firstNumb;
        theMainGallows.mainMaps();

        for (int i = 0; i < TIMES_INT; i++) {
            secondString.append('_');
            s = secondString.toString();
        }

        while (true) {

            extractedErrors();

            System.out.print("\nСлово: " + s);
            System.out.print("\nБуква: ");

            firstNumb = scanner.next().toUpperCase().charAt(0);

            isFalse = isaBoolean(isFalse, firstNumb);

            ResultErrorsMethod(isFalse);

            CheckingChoose(theMainGallows);
        }
    }

    private static boolean isaBoolean(boolean isFalse, char firstNumb) {
        //Проверка на наличие буквы, в массиве символов
        for (int y = 0; y < chars.length; y++) {
            if (chars[y] == firstNumb) {
                isFalse = true;
                secondString.replace(y, y, String.valueOf(firstNumb));
                s = secondString.toString();
            }
        }
        return isFalse;
    }

    private static void ResultErrorsMethod(boolean isFalse) {
        if (!isFalse) {
            error++;
        }
    }

    private static void CheckingChoose(TheMainGallows theMainGallows) {
        if (error == 1) {
            theMainGallows.mainMapsSecond();
        }
        if (error == 2) {
            theMainGallows.mainMapsThree();
        }
        if (error == 3) {
            theMainGallows.mainMapsFor();
        }
        if (error == 4) {
            theMainGallows.mainMapsFive();
        }
        if (error == 5) {
            theMainGallows.mainMapsSix();
        }
        if (error == 6) {
            theMainGallows.mainMapsSeven();
            System.out.println("КОНЕЦ ИГРЫ");
            System.exit(0);
        }
    }

    //Вывод количества ошибок, которые допустил игрок
    private static void extractedErrors() {
        System.out.println("\nОшибки: (" + error + ")");
    }

    private static char[] getChars() {
        Random random = new Random();
        int pos = random.nextInt(Slovar.slovar.length);
        char[] chars = Slovar.slovar[pos].toUpperCase().toCharArray();
        return chars;
    }
}
