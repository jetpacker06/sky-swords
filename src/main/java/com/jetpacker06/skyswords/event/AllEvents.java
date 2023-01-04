package com.jetpacker06.skyswords.event;

import com.jetpacker06.skyswords.SkySwords;
import com.jetpacker06.skyswords.item.SkySword;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SkySwords.MOD_ID)
@SuppressWarnings("unused")
public class AllEvents {
    public static Item recentHitItem = Items.AIR;
    public static Player recentAttacker = null;

    @SubscribeEvent
    public static void onEntityHit(AttackEntityEvent event) {
        recentAttacker = event.getPlayer();
        recentHitItem = recentAttacker.getItemInHand(recentAttacker.getUsedItemHand()).getItem();
    }
    @SubscribeEvent
    public static void onEntityHurt(LivingHurtEvent event) {
        if (recentHitItem instanceof SkySword item) {
            item.handleAttack(event);
        }
    }
}
