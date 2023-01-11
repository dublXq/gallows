import java.util.Scanner;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */

public class Launcher {

    public static int error;

    public static void main(String[] args) {

        TheMainGallows theMainGallows = new TheMainGallows();
        theMainGallows.mainMaps();
        int n = (int) Math.floor(Math.random() * Slovar.slovar.length);
        char[] chars = Slovar.slovar[n].toUpperCase().toCharArray();
        int AmountFalse;
        while (true) {

            // Создание трех объектов, классов Slovar, Scanner и TheMainGallows
            Slovar slovar_new = new Slovar();

            Scanner scanner = new Scanner(System.in);
            char secondChar = '_';
            boolean isFalse = false;

            // Слово преоброзуется в массив букв


            // Количество букв преоброзуется в число и записывается в временную переменную
            int TIMES_INT = chars.length;

//        Рисуется "_" по количеству в переменной - TIMES_INT
            System.out.print("\nСлово: ");
            for (int i = 0; i < TIMES_INT; i++) {
                System.out.print(secondChar + " ");
            }

            //Вывод количества ошибок, которые допустил игрок
            System.out.println("\nОшибки: (" + error + ")");

            int i;
            for (i = 0; i < chars.length; i++) {
                System.out.print(chars[i] + " ");
            }

            System.out.print("Буква: ");
            char firstNumb = scanner.next().toUpperCase().charAt(0);

            //Проверка на наличие буквы, в массиве символов
            for (int y = 0; y < chars.length; y++) {
                if (!isFalse){
                    if (firstNumb != chars[y]){

                    }
                }
                if (chars[y] == firstNumb)
                    isFalse = true;
                if (isFalse) {

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
            }
        }
    }
}
