package com.detectivenerd.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.detectivenerd.tutorialmod.blocks.BlockBase;
import com.detectivenerd.tutorialmod.blocks.ObsidianIngotBlock;
import com.detectivenerd.tutorialmod.blocks.RubyBlock;
import com.detectivenerd.tutorialmod.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block OBSIDIAN_INGOT_BLOCK = new ObsidianIngotBlock("obsidian_ingot_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	
}
