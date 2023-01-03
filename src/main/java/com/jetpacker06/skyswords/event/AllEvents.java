package com.jetpacker06.skyswords.event;

import com.jetpacker06.skyswords.SkySwords;
import com.jetpacker06.skyswords.item.items.EndSwordItem;
import com.jetpacker06.skyswords.item.items.FlamingSwordItem;
import com.jetpacker06.skyswords.item.items.SpiderSwordItem;
import com.jetpacker06.skyswords.item.items.UndeadSwordItem;
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

    @SubscribeEvent
    public static void onEntityHit(AttackEntityEvent event) {
        recentHitItem = event.getPlayer().getItemInHand(event.getPlayer().getUsedItemHand()).getItem();
    }
    @SubscribeEvent
    public static void onEntityHurt(LivingHurtEvent event) {
        SpiderSwordItem.handleAttack(event);
        UndeadSwordItem.handleAttack(event);
        EndSwordItem.handleAttack(event);
        FlamingSwordItem.handleAttack(event);
    }
}
