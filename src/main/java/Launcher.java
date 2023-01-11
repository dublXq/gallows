import java.util.Arrays;
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

    public static void main(String[] args) {

        TheMainGallows theMainGallows = new TheMainGallows();
        theMainGallows.mainMaps();

        while (true) {

            // Создание трех объектов, классов Slovar, Scanner и TheMainGallows
            Slovar slovar_new = new Slovar();

            Scanner scanner = new Scanner(System.in);


            boolean isFalse = false;
            char firstNumb;


//        Рисуется "_" по количеству в переменной - TIMES_INT
            System.out.print("\nСлово: " + getBuilder());

            //Вывод количества ошибок, которые допустил игрок
            System.out.println("\nОшибки: (" + error + ")");

            System.out.print("Буква: ");
            firstNumb = scanner.next().toUpperCase().charAt(0);

            //Проверка на наличие буквы, в массиве символов
            for (int y = 0; y < chars.length; y++) {

                if (chars[y] == firstNumb) {
                    isFalse = true;

                }
            }


            if (!isFalse) {
                error++;
            }

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
                break;
            }
        }


    }

    public static StringBuilder getBuilder() {
        StringBuilder secondString = new StringBuilder();
        for (int i = 1; i <= TIMES_INT; i++) {
            secondString.append("_").append(" ");
        }
        return secondString;
    }

    private static char[] getChars() {
        int n = (int) Math.floor(Math.random() * Slovar.slovar.length);
        char[] chars = Slovar.slovar[n].toUpperCase().toCharArray();
        return chars;
    }
}
