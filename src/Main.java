import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    File hello = new File("hello.txt");
    RepresentFile.representTextFromFile(hello);

        Scanner cmdToStart = new Scanner(System.in);
        String key = cmdToStart.next();
        switch (key) {
            case "h":
                System.out.println();
                File help = new File("instructions.txt");
                RepresentFile.representTextFromFile(help);
            case "c":
                System.out.println();
                System.out.println("Ok, make your calculations below:");
                System.out.println();
            default:
                System.out.println("unknown command");
        }
        // обработка ввода для вывода подсказки или перехода к вычислениям




    }
}
