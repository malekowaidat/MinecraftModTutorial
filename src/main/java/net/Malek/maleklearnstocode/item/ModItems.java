package net.Malek.maleklearnstocode.item;

import net.Malek.maleklearnstocode.MalekMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MalekMod.MODID);

    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new Item(new Item.Properties().food(ModFoods.BURGER)));

    public static final RegistryObject<Item> BURNTBURGER = ITEMS.register("burnt_burger",
            () -> new Item(new Item.Properties().food(ModFoods.BURNTBURGER)));

    public static final RegistryObject<SwordItem> ENERGYSWORD = ITEMS.register("energy_sword",
            () -> new SwordItem(Tiers.NETHERITE, 10, -2.0f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
