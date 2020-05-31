package com.potatostudio.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class AnKangYu extends Item {
    public AnKangYu() {
        super(new Properties().maxStackSize(1).addToolType(ToolType.PICKAXE,3));
        this.setRegistryName("ankang_yu");
    }
}
