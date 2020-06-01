package com.potatostudio.blocks.schoolSignBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;


public class OoaraiBlock extends Block {
    public OoaraiBlock() {
        super(Properties.create(Material.ROCK)
//                方块属性
                .lightValue(15)
                .hardnessAndResistance(3)
                .harvestLevel(2)
                .sound(SoundType.STONE)
        );
    this.setRegistryName("ooarai_block");// 命名
    }

//    方块状态
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING, BlockStateProperties.POWERED);
    }
}
