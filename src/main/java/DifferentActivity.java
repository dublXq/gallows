/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class DifferentActivity extends Launcher {

    protected static boolean isaBoolean(boolean isFalse, char firstNumb) {
        //Проверка на наличие буквы, в массиве символов
        for (int y = 0; y < chars.length; y++) {
            if (chars[y] == firstNumb) {
                isFalse = true;
                secondString.replace(y, y + 1, String.valueOf(firstNumb));
                s = secondString.toString();
            }
        }
        return isFalse;
    }

}
