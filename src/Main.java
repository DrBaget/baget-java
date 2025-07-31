import entities.User;
import utils.ConsolePrinter;

public class Main {
    public static void main(String[] args) {
        User newUser = new User("DrBaget", ":25565","http");

        ConsolePrinter.print(newUser.nickName);
    }
}