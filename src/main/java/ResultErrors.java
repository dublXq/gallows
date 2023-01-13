/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class ResultErrors extends Launcher {

    protected static void ResultErrorsMethod(boolean isFalse) {
        if (!isFalse) {
            error++;
        }
    }

    //Вывод количества ошибок, которые допустил игрок
    protected static void extractedErrors() {
        System.out.println("Ошибки: (" + error + ")");
    }

}
