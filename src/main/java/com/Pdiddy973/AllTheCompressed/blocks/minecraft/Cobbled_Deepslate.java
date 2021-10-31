package com.Pdiddy973.AllTheCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Cobbled_Deepslate extends Block {
    public Cobbled_Deepslate() {
        super(Properties.of(Material.STONE)
            .sound(SoundType.DEEPSLATE)
            .strength(0.85f, 1.0f));
    }
}
