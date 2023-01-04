package com.jetpacker06.skyswords.item.items;

import com.jetpacker06.skyswords.event.AllEvents;
import com.jetpacker06.skyswords.item.SkySword;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class UndeadSwordItem extends SkySword {
    public UndeadSwordItem(int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(Tiers.IRON, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void handleAttack(LivingHurtEvent event) {
        if (!(event.getEntity() instanceof LivingEntity target)) {
            return;
        }
        if (!(target.getMobType() == MobType.UNDEAD)) {
            return;
        }
        if (!(AllEvents.recentHitItem instanceof UndeadSwordItem)) {
            return;
        }
        event.setAmount(event.getAmount() * 2);
    }

    @Override
    public String getTooltipKey() {
        return "tooltip.undead_sword";
    }
}

//TODO recipe