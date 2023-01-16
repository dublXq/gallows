import java.awt.*;
import java.io.IOException;
import java.net.URI;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class Check extends Launcher {

    protected static void CheckingChoose(TheMainGallows theMainGallows) throws IOException {
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
            Desktop.getDesktop().browse(URI.create("https://i.gifer.com/980W.gif"));
            System.exit(0);
        }
    }

}
