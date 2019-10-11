package com.moosymantheboss.tutorialmod.init;

import java.util.List;

import com.moosymantheboss.tutorialmod.items.ItemBase;
import com.moosymantheboss.tutorialmod.items.tools.ToolAxe;
import com.moosymantheboss.tutorialmod.items.tools.ToolHoe;
import com.moosymantheboss.tutorialmod.items.tools.ToolPickaxe;
import com.moosymantheboss.tutorialmod.items.tools.ToolSpade;
import com.moosymantheboss.tutorialmod.items.tools.ToolSword;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 2, 250, 8.0F, 2.0F, 22);
	
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SARCONITE_INGOT = new ItemBase("sarconite_ingot");
	public static final Item EMER = new ItemBase("emer");
	
	//tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
}
