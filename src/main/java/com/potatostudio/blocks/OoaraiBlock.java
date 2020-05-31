package com.potatostudio.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class OoaraiBlock extends Block {
    public OoaraiBlock() {
        super(Properties.create(Material.ROCK)
                .lightValue(15)
                .hardnessAndResistance(3)
                .harvestLevel(2)
                .sound(SoundType.STONE)
        );
    this.setRegistryName("ooarai_block");
    }
}
