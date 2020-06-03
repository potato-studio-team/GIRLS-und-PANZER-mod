package com.potatostudio.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class Anglerfish extends Item {
    public Anglerfish() {
        super(new Properties().maxStackSize(64).addToolType(ToolType.PICKAXE,3).maxDamage(100));
        this.setRegistryName("angler_fish");
    }
}
