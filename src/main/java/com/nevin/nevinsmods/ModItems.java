package com.nevin.nevinsmods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("nevinsmods:Ruby")
    public static Ruby ruby;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ruby.initModel();
    }

}
