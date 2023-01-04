package com.jetpacker06.skyswords.item.items;

import com.jetpacker06.skyswords.event.AllEvents;
import com.jetpacker06.skyswords.item.AllTiers;
import com.jetpacker06.skyswords.item.SkySword;
import com.jetpacker06.skyswords.item.util.ItemUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import org.jetbrains.annotations.NotNull;

public class PrismarineBladeItem extends SkySword {

    public PrismarineBladeItem(int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(AllTiers.JERRY, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public String getTooltipKey() {
        return "tooltip.prismarine_blade";
    }

    @Override
    public void handleAttack(LivingHurtEvent event) {
        Player player = AllEvents.recentAttacker;
        if (player.isInWater()) {
            event.setAmount(event.getAmount() * 2);
        }
    }
}
