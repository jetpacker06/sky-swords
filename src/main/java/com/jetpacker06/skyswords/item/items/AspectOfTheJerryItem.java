package com.jetpacker06.skyswords.item.items;

import com.jetpacker06.skyswords.item.AllTiers;
import com.jetpacker06.skyswords.item.SkySword;
import com.jetpacker06.skyswords.item.util.ItemUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class AspectOfTheJerryItem extends SkySword {

    public AspectOfTheJerryItem(int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(AllTiers.JERRY, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, @NotNull Player pPlayer, @NotNull InteractionHand pUsedHand) {
        pLevel.playSound(pPlayer, new BlockPos(pPlayer.position()), SoundEvents.VILLAGER_AMBIENT, SoundSource.PLAYERS, 2f, 1f);
        ItemUtil.damageItem(pPlayer, pUsedHand, -1);
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public String getTooltipKey() {
        return "tooltip.aspect_of_the_jerry";
    }
}
