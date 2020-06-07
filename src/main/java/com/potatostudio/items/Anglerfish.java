package com.potatostudio.items;

import com.potatostudio.util.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

import java.util.Properties;

public class Anglerfish extends Item {
    public Anglerfish() {
        super(new Properties()
                .maxStackSize(64)
                .addToolType(ToolType.PICKAXE,3)
                .maxDamage(100)
                .group(Utils.itemGroup)
        );
        this.setRegistryName("angler_fish");
    }
}
