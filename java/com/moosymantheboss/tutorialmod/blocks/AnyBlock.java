package com.moosymantheboss.tutorialmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AnyBlock extends BlockBase{
	
	public AnyBlock(String name, Material material, SoundType sound, float hardness, float resistance, String tool, int harvestLvl) {
		super(name, material);
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, harvestLvl);
	}

}
