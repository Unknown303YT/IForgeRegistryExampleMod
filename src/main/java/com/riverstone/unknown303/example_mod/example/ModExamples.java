package com.riverstone.unknown303.example_mod.example;

import com.riverstone.unknown303.example_mod.ExampleMod;
import com.riverstone.unknown303.example_mod.ModRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModExamples {
    public static final DeferredRegister<String> EXAMPLES_IFORGEREG =
            DeferredRegister.create(ModRegistries.EXAMPLE_REGISTRY.get(), ExampleMod.MOD_ID); // This will fail

    public static final DeferredRegister<String> EXAMPLES_RESOURCELOCATION =
            DeferredRegister.create(ResourceLocation.fromNamespaceAndPath(
                    ExampleMod.MOD_ID, "example_registry"), ExampleMod.MOD_ID); // This is quite annoying, and could easily be made unnecessary. It essentially uses a ResourceKey without having the variable.

    public static final DeferredRegister<String> EXAMPLES_RESOURCEKEY =
            DeferredRegister.create(ModRegistries.Keys.EXAMPLE_REGISTRY_KEY, ExampleMod.MOD_ID); // Again, annoying for using the DeferredRegister and could easily be fixed.

    public static void register(IEventBus eventBus) {
        EXAMPLES_IFORGEREG.register(eventBus);
        EXAMPLES_RESOURCELOCATION.register(eventBus);
        EXAMPLES_RESOURCEKEY.register(eventBus);
    }
}
