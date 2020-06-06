package com.potatostudio.blocks.Tank;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TankMaker extends Block {
    public TankMaker() {
        super(Properties.create(Material.ROCK)
//                方块属性
                        .lightValue(15)
                        .hardnessAndResistance(3)
                        .harvestLevel(2)
                        .sound(SoundType.STONE)
        );
        this.setRegistryName("tank_maker");// 命名
    }
}
