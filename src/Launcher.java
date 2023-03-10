
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;


/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */

public class Launcher {

    // Количество ошибок
    public static int error;
    // Слово преобразуется в массив букв
    public static char[] chars = Wordbook.getChars();

    // Количество букв преобразуется в число и записывается во временную переменную
    public static int TIMES_INT = chars.length;
    public static StringBuilder secondString = new StringBuilder();
    public static String s = "";
    public static boolean checkWordEng;

    public static void main(String[] args) throws IOException {

        // Создание двух объектов, классов, Scanner и TheMainGallows

        TheMainGallows theMainGallows = new TheMainGallows();
        Scanner scanner = new Scanner(System.in);

        char firstNumb = ' ';
        theMainGallows.mainMaps();

        for (int i = 0; i < TIMES_INT; i++) {
            secondString.append('_');
            s = secondString.toString();
        }

        System.out.print("Приветствую! Готовы сыграть в игру?\n1.Да\n2.Нет\nОтвет: ");
        int numbChoose = new Scanner(System.in).nextInt();
        if (numbChoose == 1) {

            while (true) {

                boolean isFalse = false;
                System.out.print("Слово: " + s + "\n");
                ResultErrors.extractedErrors();
                System.out.print("Буква: ");

                firstNumb = scanner.next().toUpperCase().charAt(0);

                for (int i = 0; i < Wordbook.wordBookEng.length; i++) {
                    if (firstNumb == Wordbook.wordBookEng[i]) {
                        System.out.println("Вы ввели латинскую букву.");
                        checkWordEng = true;
                    }
                }

                ResultErrors.CheckForDoubleSymbol(firstNumb);

                isFalse = DifferentActivity.isaBoolean(isFalse, firstNumb);

                ResultErrors.ResultErrorsMethod(isFalse);

                Check.CheckingChoose(theMainGallows);

                if (!s.contains("_")) {
                    System.out.println("ПОБЕДА! ПОЗДРАВЛЯЕМ!");
                    Desktop.getDesktop().browse(URI.create("https://i.gifer.com/9cND.gif"));
                    return;
                }
            }

        } else if (numbChoose == 2) {
            System.out.println("Чтобы начать игру, нажмите - 1");
            System.exit(1);
        } else {
            System.out.println("Такого варианта не существует! Повторите попытку...");
            System.exit(2);
        }
    }
}
