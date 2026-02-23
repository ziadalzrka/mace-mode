package com.example.mace.items;
import com.example.mace.enchantments.ModEnchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;

public class ItemMace extends ItemSword {
    public ItemMace() {
        super(ToolMaterial.IRON);
        setRegistryName("mace");
        setUnlocalizedName("mace");
    }
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if (attacker.fallDistance > 1.5F && !attacker.onGround) {
            int dLevel = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.DENSITY, stack);
            float damage = attacker.fallDistance * (3.0F + dLevel);
            target.attackEntityFrom(DamageSource.causeMobDamage(attacker), damage);
            attacker.fallDistance = 0;
        }
        return super.hitEntity(stack, target, attacker);
    }
}
