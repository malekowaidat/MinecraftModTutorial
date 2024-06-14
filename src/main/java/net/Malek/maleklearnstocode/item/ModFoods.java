package net.Malek.maleklearnstocode.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BURGER = new FoodProperties.Builder().nutrition(5)
            .saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100),1)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100),1).build();

    public static final FoodProperties BURNTBURGER = new FoodProperties.Builder().nutrition(1)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 100),1)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200),1)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 100),1).build();
}
