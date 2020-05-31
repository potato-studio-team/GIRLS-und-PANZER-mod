package com.potatostudio.util;

import com.potatostudio.blocks.ModBlocks;
import com.potatostudio.items.ModeItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)

public class RegistryHandler {
    @SubscribeEvent
    public static void onItemsRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ModeItems.Anglerfish);
        event.getRegistry().register(new BlockItem(ModBlocks.ooaraiBlock, new Item.Properties())
                .setRegistryName(ModBlocks.ooaraiBlock.getRegistryName())
        );
    }
    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(ModBlocks.ooaraiBlock);
    }
}
