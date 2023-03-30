import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculations {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        File hello = new File("hello.txt");
        representTextFromFile(hello);
        frame();
        representStart();
        process();
    }

    public static void process() {
        int a = getNumber();
        int b = getNumber();
        char operator = getOperator();
        String result = calculator(a, b, operator);
        System.out.println("the result is " + result);
        toDoOrNot();
        process();
    }

    public static int getNumber () {
        System.out.println("Enter the number");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Integer required");
            return getNumber();
        }
    }

    public static char getOperator () {
        char result;
        System.out.println("Enter the operation, use  +, -, * or /");
        if (scanner.hasNext()) {
            result = scanner.next().charAt(0);
        } else {
            result= getOperator();
        }
        return result;
    }

    public static String calculator(int a, int b, char operator) {
        switch(operator) {
            case '+': return String.valueOf(a + b);
            case '-': return String.valueOf(a - b);
            case '*': return String.valueOf(a * b);
            case '/': return String.valueOf(a / b);
            default: {
                System.out.println("Error! Wrong or non-existent operation!");
                return "not defined!";
            }
        }
    }

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
        String key = scanner.next();
        switch (key) {
            case "h", "H", "р", "Р" -> {
                File help = new File("instructions.txt");
                representTextFromFile(help);
                frame();
                toDoOrNot();
                System.out.println("Ok, make your calculations below:");
                frame();
            }
            case "c", "C", "с", "С" -> {
                System.out.println("Ok, make your calculations below:");
                frame();
            }
            default -> {
                System.out.println("unknown command");
                representStart();
            }
        }
    }

    public static void toDoOrNot () {
        System.out.println("Do you want to continue?");
        String answer = scanner.next();
        switch (answer) {
            case "y", "Y", "н", "Н" -> System.out.println();
            case "n", "N", "т", "Т" -> {
                exit();
                System.exit(0);
            }
            default ->
                toDoOrNot();
        }
    }

    public static void frame () {
        System.out.println("=====================================");
    }

    public static void exit() {
        System.out.println("Bye");
    }
}


