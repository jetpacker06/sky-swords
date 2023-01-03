package com.jetpacker06.skyswords.item.items;

import com.jetpacker06.skyswords.event.AllEvents;
import com.jetpacker06.skyswords.item.SkySword;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EndSwordItem extends SkySword {
    public EndSwordItem(int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(Tiers.IRON, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }
    public static void handleAttack(LivingHurtEvent event) {
        if (!(event.getEntity() instanceof LivingEntity target)) {
            return;
        }
        if (!(target instanceof EnderMan
                || target instanceof Endermite
                || target instanceof Shulker
                || target instanceof EnderDragon)) {
            return;
        }
        if (!(AllEvents.recentHitItem instanceof EndSwordItem)) {
            return;
        }
        event.setAmount(event.getAmount() * 2);
    }

    @Override
    public String getTooltipKey() {
        return "tooltip.end_sword";
    }
}
//TODO recipe