package com.potatostudio.util;

import com.potatostudio.TileEntity.ModTileEntityType;
import com.potatostudio.blocks.ModBlocks;
import com.potatostudio.items.ModeItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)

public class RegistryHandler {
    // 物品
    @SubscribeEvent
    public static void onItemsRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ModeItems.Anglerfish);
        event.getRegistry().register(new BlockItem(ModBlocks.ooaraiBlock, new Item.Properties().group(Utils.itemGroup))
                .setRegistryName(ModBlocks.ooaraiBlock.getRegistryName())
        );
        event.getRegistry().register(new BlockItem(ModBlocks.tankMaker, new Item.Properties().group(Utils.itemGroup))
                .setRegistryName(ModBlocks.tankMaker.getRegistryName())
        );
    }

    // 方块
    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(ModBlocks.ooaraiBlock);
        event.getRegistry().register(ModBlocks.tankMaker);
    }

    // 方块实体
    @SubscribeEvent
    public static void onTileEntityRegistry(RegistryEvent.Register<TileEntityType<?>> event) {
        event.getRegistry().register(ModTileEntityType.TankMakerTileEntityType);
    }
}