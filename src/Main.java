import entities.User;
import entities.items.Item;
import enums.InterfaceEnum;
import utils.ConsolePrinter;
import utils.ScreenSettings;

public class Main {
    public static void main(String[] args) {
        ScreenSettings.width = 1920;
        ScreenSettings.height = 1080;

        User newUser = new User("DrBaget", ":25565","http");

        ConsolePrinter.print(newUser.nickName);

        Item someBlock = new Item("Stone", 64);

        newUser.userIntarface.addItem(someBlock, InterfaceEnum.GENERAL_SLOTS);
    }
}