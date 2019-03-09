package com.detectivenerd.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.detectivenerd.tutorialmod.items.ItemBase;
import com.detectivenerd.tutorialmod.items.armor.ArmorBase;
import com.detectivenerd.tutorialmod.items.food.FoodBase;
import com.detectivenerd.tutorialmod.items.food.FoodEffectBase;
import com.detectivenerd.tutorialmod.items.tools.ToolAxe;
import com.detectivenerd.tutorialmod.items.tools.ToolHoe;
import com.detectivenerd.tutorialmod.items.tools.ToolPickaxe;
import com.detectivenerd.tutorialmod.items.tools.ToolSpade;
import com.detectivenerd.tutorialmod.items.tools.ToolSword;
import com.detectivenerd.tutorialmod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 550, 8.0F, 3.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 25, 
			new int[]{2, 6, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ToolMaterial MATERIAL_OBSIDIAN_INGOT = EnumHelper.addToolMaterial("material_obsidian_ingot", 4, 3122, 10.0F, 5.0F, 12);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN_INGOT = EnumHelper.addArmorMaterial("armor_material_obsidian_ingot", Reference.MOD_ID + ":obsidian_ingot", 40, 
			new int[]{4, 8, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	
	//Tools
	/// Ruby Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	/// Obsidian Tools
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN_INGOT);
	
	//Armor
	/// Ruby Armor
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
	/// Obsidian Armor
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN_INGOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN_INGOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN_INGOT, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN_INGOT, 1, EntityEquipmentSlot.FEET);
	
	//Food
	//public static final Item EVIL_APPLE = new FoodBase("evil_apple", 5, 2.4F, false);
	public static final Item EVIL_APPLE = new FoodEffectBase("evil_apple", 5, 2.4F, false, new PotionEffect(MobEffects.POISON, (60*20), 1, false, true));
	
}
