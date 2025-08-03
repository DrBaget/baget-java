package entities.items;

import enums.ToolsEnum;
import enums.ToolsMaterialEnum;
import utils.ConsolePrinter;
import utils.GeneralValidator;

public class Tools {
    private String name;
    private int durability;
    private final ToolsEnum type;
    private ToolsMaterialEnum material;

    public Tools(String name, int durability, ToolsEnum type, ToolsMaterialEnum material) {
        this.name = name;
        this.durability = durability;
        this.type = type;
        this.material = material;
    }

    private void maxDurabilityValidator(int durability){
        if(!GeneralValidator.checkCount(durability, 1, 1000)) {
            ConsolePrinter.errorPrint("Максимальна міцність: 1000");
        }
    }

    public String getName() { return this.name; };
    public int getDurability() {return this.durability; };
    public ToolsEnum getType() {return this.type;};
    public ToolsMaterialEnum getMaterial() {return this.material;};

    public void setMaterial(ToolsMaterialEnum newMaterial) {
        // <-- Якась валідація для Матеріалу.

        this.material = newMaterial;
    }

    public void setName(String newName) {
        if(!GeneralValidator.checkCount(newName.length(),1,25)){
            ConsolePrinter.errorPrint("Максимально 25, мінімально 1");
        };
        this.name = newName;
    }

    public void setDurability(int newDurability){
        if (!GeneralValidator.checkCount(newDurability, 1, 1000)){
            ConsolePrinter.errorPrint("Мінімальна міцність 1, максимальна 1000.");
        }
        this.durability = newDurability;
    }


}
