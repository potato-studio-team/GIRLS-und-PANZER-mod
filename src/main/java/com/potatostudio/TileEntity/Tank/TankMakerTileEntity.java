package com.potatostudio.TileEntity.Tank;

import com.potatostudio.TileEntity.ModTileEntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;

public class TankMakerTileEntity extends TileEntity {
    private int tankNum = 0;

    // 加值
    public int increase() {
        tankNum ++;
        return tankNum;
    }

    // 减值
    public int decrease() {
        tankNum --;
        return tankNum;
    }

    // 读NBT
    @Override
    public void read(CompoundNBT compound) {
        super.read(compound);
        tankNum = compound.getInt("tankNum");
    }

    // 写NBT
    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.putInt("tankNum",tankNum);
        super.write(compound);
        return compound;
    }

    //连接TileEntity
    public TankMakerTileEntity() {
        super(ModTileEntityType.TankMakerTileEntityType);
    }
}
