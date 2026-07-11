package com.obsidianarmor;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ObsidianArmorItem extends ArmorItem {
    public ObsidianArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (world.isClient) {
            return;
        }
        if (!(entity instanceof PlayerEntity player)) {
            return;
        }
        if (!isFullSetEquipped(player)) {
            return;
        }

        // Grant fire resistance while wearing the full set.
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 220, 0, false, false, false));
        // Slow movement while wearing the full set.
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 220, 0, false, false, false));
    }

    private static boolean isFullSetEquipped(PlayerEntity player) {
        ItemStack helmet = player.getEquippedStack(net.minecraft.entity.EquipmentSlot.HEAD);
        ItemStack chest = player.getEquippedStack(net.minecraft.entity.EquipmentSlot.CHEST);
        ItemStack legs = player.getEquippedStack(net.minecraft.entity.EquipmentSlot.LEGS);
        ItemStack feet = player.getEquippedStack(net.minecraft.entity.EquipmentSlot.FEET);

        return helmet.getItem() == ObsidianArmorMod.OBSIDIAN_HELMET
                && chest.getItem() == ObsidianArmorMod.OBSIDIAN_CHESTPLATE
                && legs.getItem() == ObsidianArmorMod.OBSIDIAN_LEGGINGS
                && feet.getItem() == ObsidianArmorMod.OBSIDIAN_BOOTS;
    }
}