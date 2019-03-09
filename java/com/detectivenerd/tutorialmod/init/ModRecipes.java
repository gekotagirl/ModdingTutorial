package com.detectivenerd.tutorialmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		//GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModBlocks.RUBY_BLOCK, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 1.5F);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_INGOT, 1), 1.5F);
		/*
		 for blocks do Blocks.-BLOCK-
		 for items do Items.-ITEM-
		 */
	}
}
