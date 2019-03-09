package com.detectivenerd.tutorialmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase 
{

	public RubyBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0F); used for something like glowstone or torches
		//setLightOpacity(1); used for turning the block into glass
		//setBlockUnbreakable(); used to make a block unbreakable like bedrock
	}

}
