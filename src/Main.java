import entities.User;
import entities.items.Item;
import entities.items.Tools;
import enums.InterfaceEnum;
import enums.ToolsEnum;
import enums.ToolsMaterialEnum;
import utils.ConsolePrinter;
import utils.ScreenSettings;


public class Main {
    public static void main(String[] args) {
        ScreenSettings.width = 1920;
        ScreenSettings.height = 1080;

        Tools newTool = new Tools("Кайло", 999, ToolsEnum.PICKAXE, ToolsMaterialEnum.DIAMOND);
        User newUser = new User("DrBaget", ":25565","http");

        ConsolePrinter.print(newUser.nickName);

        Item someBlock = new Item("Stone", 64);

        newUser.userIntarface.addItem(someBlock, InterfaceEnum.GENERAL_SLOTS);

        newTool.setMaterial(ToolsMaterialEnum.IRON);
        ConsolePrinter.print(newTool.getMaterial().toString() + " " + newTool.getName());
    }
}