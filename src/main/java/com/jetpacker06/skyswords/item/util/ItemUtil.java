package com.jetpacker06.skyswords.item.util;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static com.jetpacker06.skyswords.SkySwords.log;

public class ItemUtil {
    /**
     * @param player The player holding the item.
     * @param hand The hand the item is held in.
     * @param amount The amount of damage to apply.
     */
    public static void damageItem(Player player, InteractionHand hand, int amount) {
        ItemStack item = player.getItemInHand(hand);
        if (!item.hasTag()) {
            CompoundTag tag = new CompoundTag();
            tag.putInt("Damage", 0);
            item.setTag(tag);
        }
        CompoundTag tag = item.getTag();
        assert tag != null;
        int newDamageValue = tag.getInt("Damage") + amount;
        if (newDamageValue < 0) {
            newDamageValue = 0;
        }
        tag.putInt("Damage", newDamageValue);
        log(newDamageValue);
        if (newDamageValue >= item.getMaxDamage()) {
            player.setItemInHand(hand, new ItemStack(Items.AIR));
            player.getLevel().playLocalSound(player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BREAK, player.getSoundSource(), 0.8F, 0.8F + player.getLevel().random.nextFloat() * 0.4F, false);
        }
    }
}
