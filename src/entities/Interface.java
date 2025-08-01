package entities;

import entities.items.Item;
import enums.InterfaceEnum;
import utils.GeneralValidator;

import java.util.ArrayList;
import java.util.List;

public class Interface {
    private List<Item> armorSlots = new ArrayList<>();     // 4 слоти
    private List<Item> generalSlots = new ArrayList<>();   // 27 слотів
    private List<Item> hotBarSlots = new ArrayList<>();    // 9 слотів

    public Interface() {}

    public void addItem(Item newItem, InterfaceEnum interfaceType){
        if(interfaceType == InterfaceEnum.ARMOR_SLOTS){
            if(GeneralValidator.checkCount(armorSlots.size() + 1, 0 ,4));

            this.armorSlots.add(newItem);
        };

        if(interfaceType == InterfaceEnum.GENERAL_SLOTS){
            if(GeneralValidator.checkCount(armorSlots.size() + 1, 0 ,27));

            this.generalSlots.add(newItem);
        };

        if(interfaceType == InterfaceEnum.HOT_BAR_SLOTS){
            if(GeneralValidator.checkCount(armorSlots.size() + 1, 0 ,9));

            this.hotBarSlots.add(newItem);
        };
    };
}
