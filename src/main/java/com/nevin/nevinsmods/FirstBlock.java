package com.nevin.nevinsmods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FirstBlock extends Block {
    public FirstBlock() {
        super(Material.ROCK);
        setRegistryName("firstblock");
        setTranslationKey(Tags.MOD_ID + ".firstblock");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
