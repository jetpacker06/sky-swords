package com.jetpacker06.skyswords.item.items;

import com.jetpacker06.skyswords.event.AllEvents;
import com.jetpacker06.skyswords.item.SkySword;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class SpiderSwordItem extends SkySword {
    public SpiderSwordItem(int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(Tiers.IRON, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }
    public static void handleAttack(LivingHurtEvent event) {
        if (!(event.getEntity() instanceof LivingEntity target)) {
            return;
        }
        if (!(target.getMobType() == MobType.ARTHROPOD)) {
            return;
        }
        if (!(AllEvents.recentHitItem instanceof SpiderSwordItem)) {
            return;
        }
        event.setAmount(event.getAmount() * 2);
    }

    @Override
    public String getTooltipKey() {
        return "tooltip.spider_sword";
    }
}
//TODO recipe