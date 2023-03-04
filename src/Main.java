import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File greet = new File("hello.txt");

        try {
            Scanner showGreet = new Scanner(greet);
            while(showGreet.hasNextLine()) {
                System.out.println(showGreet.nextLine());
            }
            showGreet.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lost hello.txt, add hello.txt and run app again...");
            throw new RuntimeException(e);
        }

        Scanner cmdToStart = new Scanner(System.in);
        String key = cmdToStart.next();
        // обработка ввода для вывода подсказки или перехода к вычислениям




    }
}
