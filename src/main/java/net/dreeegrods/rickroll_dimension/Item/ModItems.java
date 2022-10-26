package net.dreeegrods.rickroll_dimension.Item;

import net.dreeegrods.rickroll_dimension.Rickroll_dimension;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Rickroll_dimension.MOD_ID);

    public static final RegistryObject<Item> Rick = ITEMS.register("rick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
