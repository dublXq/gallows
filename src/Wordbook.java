import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Deque;
import java.util.Random;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class Wordbook extends Launcher {

    static char[] wordBookEng = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z' };
    static String[] wordbook = new String[]{
            "Автовокзал", "Выносливый", "Разноречие", "Подлокотник", "Скворечник", "Комбинация", "Клавиатура",
            "Инкассатор", "Абстракция", "Программист", "Джава", "Бездельный", "Аппаратчик", "Дислокация",
            "Запорошить", "Книгообмен", "Окружность", "Счастливец", "Угораздить", "Хиромантия", "Химический",
            "Хризантема", "Хвастливый", "Чертовщина", "Юмористика", "Бессмертие", "Воссоздать", "Безотцовщина",
            "Балетмейстер", "Безрассудный", "Благозвучный", "Вещественный", "Группировать", "Гидротехника",
            "Единственный", "Жертвователь", "Коммуникация", "Мудрствовать", "Товарищество", "Финишировать"
    };

    protected static char[] getChars() {
        Random random = new Random();
        int pos = random.nextInt(Wordbook.wordbook.length);
        char[] chars = Wordbook.wordbook[pos].toUpperCase().toCharArray();
        return chars;
    }
}
