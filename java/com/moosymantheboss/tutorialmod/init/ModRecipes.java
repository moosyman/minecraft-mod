package com.moosymantheboss.tutorialmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE_BLOCK, new ItemStack(ModItems.RUBY, 1), 2.5F);
		GameRegistry.addSmelting(ModBlocks.SARCONITE_ORE_BLOCK, new ItemStack(ModItems.SARCONITE_INGOT, 1), 2.0F);
		GameRegistry.addSmelting(ModBlocks.EMER_ORE_BLOCK, new ItemStack(ModItems.EMER, 1), 3.0F);
	}
}
