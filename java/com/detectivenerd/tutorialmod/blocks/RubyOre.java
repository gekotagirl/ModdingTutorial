package com.detectivenerd.tutorialmod.blocks;

import java.util.Random;

import com.detectivenerd.tutorialmod.Main;
import com.detectivenerd.tutorialmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase 
{

	public RubyOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0F); used for something like glowstone or torches
		//setLightOpacity(1); used for turning the block into glass
		//setBlockUnbreakable(); used to make a block unbreakable like bedrock
	}
	
	/*
	//making it so that the Ruby Ore block will drop an item instead of a block
	@Override
	public Item getItemDropped(IBlockState state, Random ran, int fortune) {
	{
		return ModItems.RUBY;
		//return Items.CAKE;
	}
	
	//random number of items that can be dropped
	@Override
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	
	*/
}
