import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Represent {
    // some methods to make the representations in Main easier

    public static void representTextFromFile(File file) {
        try {
            Scanner showFile = new Scanner(file);
            while(showFile.hasNextLine()) {
                System.out.println(showFile.nextLine());
            }
            showFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lost file to read from, add it to the directory and run app again...");
            frame();
            throw new RuntimeException(e);
        }
    }

    public static void representStart() {
        Scanner cmdToStart = new Scanner(System.in);
        String key = cmdToStart.next();
        switch (key) {
            case "h" -> {
                File help = new File("instructions.txt");
                Represent.representTextFromFile(help);
                frame();
                toDoOrNot();
                System.out.println("Ok, make your calculations below:");
                frame();

            }
            case "c" -> {
                System.out.println("Ok, make your calculations below:");
                frame();
            }
            default -> {
                System.out.println("unknown command");
                representStart();
            }
        }
        cmdToStart.close();
    }

    public static void toDoOrNot () {
        System.out.println("Do you want to continue?");
        Scanner yN = new Scanner(System.in);
        String answer = yN.next();
        switch (answer) {
            case "y", "Y", "н", "Н" :
                System.out.println();
                break;
            case "n", "N", "т", "Т" :
                return;
            default: toDoOrNot();
        }
    }

    public static void frame () {
        System.out.println("====================");
    }




}
