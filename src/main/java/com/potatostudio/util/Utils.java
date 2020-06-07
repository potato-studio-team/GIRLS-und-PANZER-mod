package com.potatostudio.util;

import com.potatostudio.items.ModeItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.Properties;

public class Utils {
    public static ItemGroup itemGroup = new ItemGroup("grils_und_panzer") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModeItems.Anglerfish);
        }
    };
}
