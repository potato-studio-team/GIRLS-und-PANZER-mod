package com.potatostudio.blocks.Tank;

import com.potatostudio.TileEntity.ModTileEntityType;
import com.potatostudio.TileEntity.Tank.TankMakerTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TankMaker extends Block {
    public TankMaker() {
        super(Properties.create(Material.ROCK)
                //方块属性
                        .lightValue(15)
                        .hardnessAndResistance(3)
                        .harvestLevel(2)
                        .sound(SoundType.STONE)
        );
        this.setRegistryName("tank_maker");// 命名
    }

    // 方块功能

    // 方块放置自动方向
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        if (placer != null) {
            worldIn.setBlockState(pos,
                    state.with(BlockStateProperties.FACING, getFacingFromEntity(pos, placer)), 2);
        }
    }

    // 点击方块改变方向
    @Override
    public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
        if (player != null) {
            worldIn.setBlockState(pos,
                    state.with(BlockStateProperties.FACING, getFacingFromEntity(pos, player)), 2);
        }
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn,
                                    BlockRayTraceResult hit) {
        if(!worldIn.isRemote){
            if(hit.getFace() == state.getBlockState().get(BlockStateProperties.FACING)){
                int TankNum;
                if(hit.getPos().getX() > 0.5F){
                    TankNum = getTE(worldIn, pos).increase();
                }
                else {
                    TankNum = getTE(worldIn, pos).decrease();
                }
                TranslationTextComponent translationTextComponent =
                        new TranslationTextComponent("message.girls_und_panzer", TankNum);
                player.sendStatusMessage(translationTextComponent, false);
            }
        }
        return true;
    }
    private TankMakerTileEntity getTE(World world, BlockPos pos){
        return (TankMakerTileEntity)world.getTileEntity(pos);
    }

    // 方块方向放置改变
    public static Direction getFacingFromEntity(BlockPos clickedBlock, LivingEntity entity) {
        Vec3d vec = entity.getPositionVec();
        return Direction.getFacingFromVector(
                (float) (vec.x - clickedBlock.getX()),
                (float) (vec.y - clickedBlock.getY()),
                (float) (vec.z - clickedBlock.getZ())
        );
    }

    @Override
    protected void fillStateContainer(Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING);
    }

    // 方块实体关联
    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntityType.TankMakerTileEntityType.create();
    }
}

