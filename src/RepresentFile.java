import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RepresentFile {
    public static void representTextFromFile(File file) {
        try {
            Scanner showFile = new Scanner(file);
            while(showFile.hasNextLine()) {
                System.out.println(showFile.nextLine());
            }
            showFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lost file to read from, add it to the directory and run app again...");
            throw new RuntimeException(e);
        }
    }
}
