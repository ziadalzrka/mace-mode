package com.example.mace.enchantments;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ModEnchantments {
    public static final Enchantment DENSITY = new Enchantment(Enchantment.Rarity.COMMON, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND}){}.setRegistryName("density").setName("density");
    public static final Enchantment BREACH = new Enchantment(Enchantment.Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND}){}.setRegistryName("breach").setName("breach");
    public static final Enchantment WIND_BURST = new Enchantment(Enchantment.Rarity.VERY_RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND}){}.setRegistryName("wind_burst").setName("wind_burst");
}
