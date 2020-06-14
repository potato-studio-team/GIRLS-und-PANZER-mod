package com.potatostudio.blocks.Tank.TankMaker;

import com.mojang.datafixers.types.Type;
import net.minecraft.tileentity.TileEntityType;

import java.util.Set;
import java.util.function.Supplier;

public class TankMakerTileEntity extends TileEntityType {
    public TankMakerTileEntity(Supplier factoryIn, Set validBlocksIn, Type dataFixerType) {
        super(factoryIn, validBlocksIn, dataFixerType);
    }
}
