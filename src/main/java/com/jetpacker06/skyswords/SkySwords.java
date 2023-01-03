package com.jetpacker06.skyswords;

import com.jetpacker06.skyswords.effect.AllEffects;
import com.jetpacker06.skyswords.item.AllItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("skyswords")
public class SkySwords {
    public static final String MOD_ID = "skyswords";
    private static final Logger logger = LogManager.getLogger();
    public static void log(Object message) {
        logger.info(message);
    }

    public SkySwords() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        AllItems.register(eventBus);
        AllEffects.register(eventBus);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }
}
