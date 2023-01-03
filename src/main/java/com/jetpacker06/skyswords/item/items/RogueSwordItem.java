package com.jetpacker06.skyswords.item.items;

import com.jetpacker06.skyswords.effect.AllEffects;
import com.jetpacker06.skyswords.item.AllTiers;
import com.jetpacker06.skyswords.item.SkySword;
import com.jetpacker06.skyswords.item.util.ItemUtil;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class RogueSwordItem extends SkySword {

    public RogueSwordItem(int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(AllTiers.ROGUE, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, @NotNull Player pPlayer, @NotNull InteractionHand pUsedHand) {
        if (!pPlayer.hasEffect(AllEffects.ROGUE_SPEED.get())) {
            pPlayer.addEffect(new MobEffectInstance(AllEffects.ROGUE_SPEED.get(), 600));
            ItemUtil.damageItem(pPlayer, pUsedHand, 40);
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public String getTooltipKey() {
        return "tooltip.spider_sword";
    }
}
