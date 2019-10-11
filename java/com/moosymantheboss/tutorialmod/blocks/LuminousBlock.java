package com.moosymantheboss.tutorialmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LuminousBlock extends AnyBlock{
	
	public LuminousBlock(String name, Material material, SoundType sound, float hardness, float resistance, String tool, int harvestLvl, float brightness) {
		super(name, material, sound, hardness, resistance, tool, harvestLvl);
		setLightLevel(brightness);
	}

}
