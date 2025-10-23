package com.riverstone.unknown303.example_mod;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;

import java.util.function.Supplier;

public class ModRegistries {
    private static final DeferredRegister<String> EXAMPLE_DEFERRED_REGISTER =
            DeferredRegister.create(ResourceLocation.fromNamespaceAndPath(
                    ExampleMod.MOD_ID, "example_registry"), ExampleMod.MOD_ID);
    public static final Supplier<IForgeRegistry<String>> EXAMPLE_REGISTRY =
            EXAMPLE_DEFERRED_REGISTER.makeRegistry(RegistryBuilder::new);

    public static class Keys {
        public static final ResourceKey<? extends Registry<String>> EXAMPLE_REGISTRY_KEY =
                EXAMPLE_DEFERRED_REGISTER.getRegistryKey();
    }

    public static void register(IEventBus eventBus) {
        EXAMPLE_DEFERRED_REGISTER.register(eventBus);
    }
}
