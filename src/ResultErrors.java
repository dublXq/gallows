/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class ResultErrors extends Launcher {

    protected static void ResultErrorsMethod(boolean isFalse) {

        if (Wordbook.checkWordEng) {
            System.out.println("Переключите пожалуйста клавиатуру на кириллицу, и повторите еще раз:>");
            checkWordEng = false;
        } else {
            if (!isFalse) {
                System.out.println("Упс, буквы нет в слове..");
                error++;
            }
        }
    }

    //Вывод количества ошибок, которые допустил игрок
    protected static void extractedErrors() {
        System.out.println("Ошибки: (" + error + ")");
    }

    protected static void CheckForDoubleSymbol(char firstNumb) {
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            if (firstNumb == s.charAt(i)) {
                check = true;
            }
        }
        if (check) {
            System.out.println("Вы уже ввели эту букву:)");
        }
    }
}
