package net.subayadamm.berinasiummod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.subayadamm.berinasiummod.BerinasiumMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BerinasiumMod.MOD_ID);

    //mines etc
    public static final RegistryObject<Item> BERINASIUM = ITEMS.register("berinasium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> RAW_BERINASIUM = ITEMS.register("raw_berinasium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REFINED_BERINASIUM = ITEMS.register("refined_berinasium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> BERINASIUM_CHUNK = ITEMS.register("berinasium_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    //blocks


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
