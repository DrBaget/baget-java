package entities.items;

import utils.ConsolePrinter;
import utils.GeneralValidator;

public class Item {
    private String name;
    private int count;

    public Item(String name,int count){
        this.maxCountValidator(count);

        this.name = name;
        this.count = count;
    }

    private void maxCountValidator(int count){
        if(!GeneralValidator.checkCount(count,0,64)){
            ConsolePrinter.errorPrint("Максимально 64, мінімально 0");
        };
    }

    public String getName(){
        return this.name;
    };

    public void setName(String newName){
        if(!GeneralValidator.checkCount(newName.length(),1,25)){
            ConsolePrinter.errorPrint("Максимально 25, мінімально 1");
        };

        this.name = newName;
    };

    public int getCount(){
        return this.count;
    };

    public void setCount(int newCount){
        this.maxCountValidator(newCount);

        this.count = newCount;
    };
}
