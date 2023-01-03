package com.jetpacker06.skyswords.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class AllTiers {
    public static final ForgeTier ROGUE = new ForgeTier(
            2, 240, 12.0f, 2f, 12,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.GOLD_BLOCK)
    );
    public static final ForgeTier JERRY = new ForgeTier(
            2, 240, 12.0f, 2f, 12,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.EMERALD)
    );
}
