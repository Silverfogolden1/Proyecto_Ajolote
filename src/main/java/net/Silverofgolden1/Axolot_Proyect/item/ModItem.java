package net.Silverofgolden1.Axolot_Proyect.item;

import net.Silverofgolden1.Axolot_Proyect.TechWorks;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechWorks.MOD_ID);

    public static final RegistryObject<Item> Aluminum = ITEMS.register(
            "Aluminum", () -> new Item(new Item.Properties())
    );
}


