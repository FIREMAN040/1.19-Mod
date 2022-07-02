package com.fireman.randomitems.item;

import com.fireman.randomitems.RandomItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomItems.MOD_ID);

    public static  final RegistryObject<Item> ZIRCON = ITEMS.register( "zircon",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.Random_Items)));
    public static  final RegistryObject<Item> RAW_ZIRCON = ITEMS.register( "raw_zircon",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.Random_Items)));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
