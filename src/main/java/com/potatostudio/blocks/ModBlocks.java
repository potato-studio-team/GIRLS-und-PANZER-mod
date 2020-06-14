package com.potatostudio.blocks;

import com.potatostudio.blocks.Tank.TankMaker.TankMaker;
import com.potatostudio.blocks.Tank.TankMaker.TankMakerTile;
import com.potatostudio.blocks.schoolSignBlock.OoaraiBlock;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {
    @ObjectHolder("girls_und_panzer:ooarai_block")
    public static OoaraiBlock ooaraiBlock;

    @ObjectHolder("girls_und_panzer:tank_maker")
    public static TankMaker tankMaker;

    @ObjectHolder("girls_und_panzer:tank_maker")
    public static TileEntityType<TankMakerTile> TankMaker_Tile;
}
