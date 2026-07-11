package com.obsidianarmor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ObsidianArmorMod implements ModInitializer {
    public static final String MOD_ID = "obsidianarmor";

    public static final Item OBSIDIAN_INGOT = new Item(new Item.Settings());

    public static final Item OBSIDIAN_HELMET = new ObsidianArmorItem(
            ObsidianArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item OBSIDIAN_CHESTPLATE = new ObsidianArmorItem(
            ObsidianArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item OBSIDIAN_LEGGINGS = new ObsidianArmorItem(
            ObsidianArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item OBSIDIAN_BOOTS = new ObsidianArmorItem(
            ObsidianArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final RegistryKey<ItemGroup> ITEM_GROUP_KEY =
            RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "obsidian_armor"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_ingot"), OBSIDIAN_INGOT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_boots"), OBSIDIAN_BOOTS);

        ItemGroup group = FabricItemGroup.builder()
                .icon(() -> new ItemStack(OBSIDIAN_CHESTPLATE))
                .displayName(Text.translatable("itemGroup.obsidianarmor.obsidian_armor"))
                .entries((displayContext, entries) -> {
                    entries.add(OBSIDIAN_INGOT);
                    entries.add(OBSIDIAN_HELMET);
                    entries.add(OBSIDIAN_CHESTPLATE);
                    entries.add(OBSIDIAN_LEGGINGS);
                    entries.add(OBSIDIAN_BOOTS);
                })
                .build();
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP_KEY, group);
    }
}