package com.jetpacker06.skyswords.item.items;

import com.jetpacker06.skyswords.event.AllEvents;
import com.jetpacker06.skyswords.item.SkySword;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class FlamingSwordItem extends SkySword {
    public FlamingSwordItem(int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(Tiers.IRON, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }
    public static void handleAttack(LivingHurtEvent event) {
        if (!(event.getEntity() instanceof LivingEntity target)) {
            return;
        }
        if (!(AllEvents.recentHitItem instanceof FlamingSwordItem)) {
            return;
        }
        target.setRemainingFireTicks(60);
    }

    @Override
    public String getTooltipKey() {
        return "tooltip.flaming_sword";
    }
}

//TODO recipe