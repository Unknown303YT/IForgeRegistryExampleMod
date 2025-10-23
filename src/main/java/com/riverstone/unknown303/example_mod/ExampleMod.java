package com.riverstone.unknown303.example_mod;

import com.mojang.logging.LogUtils;
import com.riverstone.unknown303.example_mod.example.ModExamples;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {
    public static final String MOD_ID = "example_mod";
    public static final String MOD_NAME = "Example Mod";

    public ExampleMod(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModRegistries.register(modEventBus);
        ModExamples.register(modEventBus);

        modEventBus.register(this);
        MinecraftForge.EVENT_BUS.addListener(this::serverStarting);
    }

    @SubscribeEvent
    public void onCommonSetup(FMLCommonSetupEvent event) {
        LogUtils.getLogger().info(
                "Starting Common Setup for %s...".formatted(MOD_NAME));

        LogUtils.getLogger().info(
                "Common Setup for %s complete!".formatted(MOD_NAME));
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        LogUtils.getLogger().info(
                "Starting Client Setup for %s...".formatted(MOD_NAME));

        LogUtils.getLogger().info(
                "Client Setup for %s complete!".formatted(MOD_NAME));
    }

    private void serverStarting(ServerStartedEvent event) {
        LogUtils.getLogger().info(
                "Starting Server Setup for %s...".formatted(MOD_NAME));

        LogUtils.getLogger().info(
                "Server Setup for %s complete!".formatted(MOD_NAME));
    }
}
