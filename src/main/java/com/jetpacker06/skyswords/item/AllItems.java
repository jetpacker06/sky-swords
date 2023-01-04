package com.jetpacker06.skyswords.item;

import com.jetpacker06.skyswords.SkySwords;
import com.jetpacker06.skyswords.item.items.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AllItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SkySwords.MOD_ID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    public static RegistryObject<Item> ingredient(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }
    private static final Item.Properties properties = new Item.Properties()
            .tab(CreativeModeTab.TAB_COMBAT).stacksTo(1);

   public static final RegistryObject<Item> ASPECT_OF_THE_JERRY = ITEMS.register("aspect_of_the_jerry",
           () -> new AspectOfTheJerryItem(3, -2.4F, properties));
   public static final RegistryObject<Item> ROGUE_SWORD = ITEMS.register("rogue_sword",
           () -> new RogueSwordItem(3, -2.4F, properties));
   public static final RegistryObject<Item> SPIDER_SWORD = ITEMS.register("spider_sword",
           () -> new SpiderSwordItem(3, -2.4F, properties));
   public static final RegistryObject<Item> UNDEAD_SWORD = ITEMS.register("undead_sword",
           () -> new UndeadSwordItem(3, -2.4F, properties));
   public static final RegistryObject<Item> END_SWORD = ITEMS.register("end_sword",
           () -> new EndSwordItem(3, -2.4F, properties));
    public static final RegistryObject<Item> FLAMING_SWORD = ITEMS.register("flaming_sword",
            () -> new FlamingSwordItem(3, -2.4F, properties));
    public static final RegistryObject<Item> PRISMARINE_BLADE = ITEMS.register("prismarine_blade",
            () -> new PrismarineBladeItem(3, -2.4F, properties));

    public static final RegistryObject<Item> GOLD_HANDLE = ingredient("gold_handle");

    private static RegistryObject<Item> register(String name, Item item) {
        return ITEMS.register(name, () -> item);
    }
}