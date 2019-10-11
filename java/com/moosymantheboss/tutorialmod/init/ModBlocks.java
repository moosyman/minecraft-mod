package com.moosymantheboss.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.moosymantheboss.tutorialmod.blocks.AnyBlock;
import com.moosymantheboss.tutorialmod.blocks.BlockBase;
import com.moosymantheboss.tutorialmod.blocks.LuminousBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new LuminousBlock("ruby_block", Material.ROCK, SoundType.STONE, 5.0F, 15.0F, "pickaxe", 2, 0.95F);
	public static final Block RUBY_ORE_BLOCK = new LuminousBlock("ruby_ore_block", Material.ROCK, SoundType.STONE, 5.0F, 15.0F, "pickaxe", 2, 0.65F);
	public static final Block SARCONITE_BLOCK = new AnyBlock("sarconite_ore_block", Material.ROCK, SoundType.STONE, 5.0F, 15.0F, "pickaxe", 2);
	public static final Block SARCONITE_ORE_BLOCK = new AnyBlock("sarconite_ore_block", Material.ROCK, SoundType.STONE, 5.0F, 15.0F, "pickaxe", 2);
	public static final Block EMER_ORE_BLOCK = new AnyBlock("emer_ore_block", Material.ROCK, SoundType.STONE, 8.0F, 20.0F, "pickaxe", 3);
	public static final Block EMER_BLOCK = new AnyBlock("emer_block", Material.IRON, SoundType.METAL, 8.0F, 20.0F, "pickaxe", 3);
}
