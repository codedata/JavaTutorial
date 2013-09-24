import java.nio.charset.Charset;
import java.io.IOException;
import java.nio.file.*;
import static java.lang.System.*;

public class HelloWorld {
    public static void main(String[] args) {
        Path source = Paths.get(args[0]);
        Charset charset = Charset.forName("UTF-8");
        try {
           for(String line : Files.readAllLines(source, charset)) {
               out.println(line);
           }
        } catch(IOException ex) {
           err.println(ex.getMessage());
        }
    }
}
