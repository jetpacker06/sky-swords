package com.jetpacker06.skyswords.effect;

import com.jetpacker06.skyswords.SkySwords;
import com.jetpacker06.skyswords.effect.effects.RogueSpeedEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AllEffects {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SkySwords.MOD_ID);

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }

    public static final RegistryObject<MobEffect> ROGUE_SPEED = EFFECTS.register( "rogue_speed",
            () -> new RogueSpeedEffect(MobEffectCategory.BENEFICIAL, 0x000000).addAttributeModifier(
                    Attributes.MOVEMENT_SPEED, "f9347a04-29a4-11ed-a261-0242ac120002", 0.2F,
                    AttributeModifier.Operation.MULTIPLY_TOTAL)
            );
}
