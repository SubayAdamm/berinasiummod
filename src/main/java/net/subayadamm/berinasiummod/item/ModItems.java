package net.subayadamm.berinasiummod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.subayadamm.berinasiummod.BerinasiumMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BerinasiumMod.MOD_ID);

    //ores
    public static final RegistryObject<Item> BERINASIUM = ITEMS.register("berinasium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> RAW_BERINASIUM = ITEMS.register("raw_berinasium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REFINED_BERINASIUM = ITEMS.register("refined_berinasium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> BERINASIUM_CHUNK = ITEMS.register("berinasium_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    //equipment
    public static final RegistryObject<Item> BERINASIUM_LONGSWORD = ITEMS.register("berinasium_longsword",
            () -> new SwordItem(Tiers.NETHERITE, 10, 5f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BERINASIUM_WARAXE = ITEMS.register("berinasium_waraxe",
            () -> new AxeItem(Tiers.NETHERITE, 10, 5f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_WARAXE = ITEMS.register("diamond_waraxe",
            () -> new AxeItem(Tiers.NETHERITE, 10, 5f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BERINASIUM_KNIFE = ITEMS.register("berinasium_knife",
            () -> new SwordItem(Tiers.NETHERITE, 10, 5f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_KNIFE = ITEMS.register("steel_knife",
            () -> new SwordItem(Tiers.IRON, 10, 5f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));


    //dismantled stuff
    public static final RegistryObject<Item> DIAMOND_AXE_HEAD = ITEMS.register("diamond_axe_head",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
