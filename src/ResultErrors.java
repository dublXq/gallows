/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class ResultErrors extends Launcher {

    protected static void ResultErrorsMethod(boolean isFalse) {

        if (Wordbook.checkWordEng) {
            System.out.println("Переключите пожалуйста клавиатуру на кириллицу, и повторите еще раз:)");
            checkWordEng = false;
        } else {
            if (!isFalse) {
                error++;
            }
        }
    }

    //Вывод количества ошибок, которые допустил игрок
    protected static void extractedErrors() {
        System.out.println("Ошибки: (" + error + ")");
    }

}
