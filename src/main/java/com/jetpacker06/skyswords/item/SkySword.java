package com.jetpacker06.skyswords.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class SkySword extends SwordItem {
    public SkySword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel,
                                @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        if (this.getTooltipKey() != null) {
            pTooltipComponents.add(new TextComponent("").append(
                    new TranslatableComponent(this.getTooltipKey())
            ));
        }
    }
    @Nullable
    public abstract String getTooltipKey();

    public void handleAttack(LivingHurtEvent event) {}
}
//"§8"