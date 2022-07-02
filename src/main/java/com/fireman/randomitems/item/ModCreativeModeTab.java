package com.fireman.randomitems.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab Random_Items = new CreativeModeTab("randomitemstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
}
