import java.io.File;

public class Main {
    public static void main(String[] args) {

        File hello = new File("hello.txt");
        Represent.representTextFromFile(hello); //show hello message

        Represent.representStart(); // switch: to see help or to continue




    }
}
