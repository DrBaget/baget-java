package utils;

public class ConsolePrinter {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void errorPrint(String error) {
        ConsolePrinter.print(error);
        throw new Error(error);
    }
}
