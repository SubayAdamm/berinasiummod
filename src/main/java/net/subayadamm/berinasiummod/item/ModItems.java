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
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> RAW_BERINASIUM = ITEMS.register("raw_berinasium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> REFINED_BERINASIUM = ITEMS.register("refined_berinasium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> BERINASIUM_CHUNK = ITEMS.register("berinasium_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> BERINASIUM_STEEL = ITEMS.register("berinasium_steel",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).tab(ModCreativeModeTab.BERINASIUM_TAB)));

    //equipment
    public static final RegistryObject<Item> BERINASIUM_LONGSWORD = ITEMS.register("berinasium_longsword",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.4f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.4f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> BERINASIUM_WARAXE = ITEMS.register("berinasium_waraxe",
            () -> new AxeItem(Tiers.NETHERITE, 8, -3.1f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> DIAMOND_WARAXE = ITEMS.register("diamond_waraxe",
            () -> new AxeItem(Tiers.DIAMOND, 7, -3.2f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> BERINASIUM_KNIFE = ITEMS.register("berinasium_knife",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2.0f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> DIAMOND_KNIFE = ITEMS.register("diamond_knife",
            () -> new SwordItem(Tiers.DIAMOND, 2, -2.0f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> STEEL_KNIFE = ITEMS.register("steel_knife",
            () -> new SwordItem(Tiers.IRON, 1, -2.0f,
                    new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).tab(ModCreativeModeTab.BERINASIUM_TAB)));

    //dismantled stuff
    public static final RegistryObject<Item> DIAMOND_AXE_HEAD = ITEMS.register("diamond_axe_head",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_TIP = ITEMS.register("diamond_sword_tip",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).tab(ModCreativeModeTab.BERINASIUM_TAB)));

    //misc
    public static final RegistryObject<Item> GLUE = ITEMS.register("glue",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).tab(ModCreativeModeTab.BERINASIUM_TAB)));
    public static final RegistryObject<Item> HONEY_WATER_MIX = ITEMS.register("honey_water_mix",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).tab(ModCreativeModeTab.BERINASIUM_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
