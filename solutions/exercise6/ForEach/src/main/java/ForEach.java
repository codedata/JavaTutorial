import java.nio.file.*;

public class ForEach {
	public static void main(String[] args) {
        for(Path parent : Paths.get(args[0])) {
        	System.out.println(parent);
        }
	}
}