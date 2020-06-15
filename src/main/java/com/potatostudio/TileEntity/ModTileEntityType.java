package com.potatostudio.TileEntity;

import com.potatostudio.TileEntity.Tank.TankMakerTileEntity;
import com.potatostudio.blocks.ModBlocks;
import net.minecraft.tileentity.TileEntityType;

public class ModTileEntityType {
    public static TileEntityType<?> TankMakerTileEntityType =
            TileEntityType.Builder.create(TankMakerTileEntity::new, ModBlocks.tankMaker)
                    .build(null)
                    .setRegistryName(ModBlocks.tankMaker.getRegistryName());
}
