package com.ckhazel132.endesite;

import com.ckhazel132.endesite.registry.ModBlocks;
import com.ckhazel132.endesite.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Endesite implements ModInitializer {
    public static final String MOD_ID="endesite";
    public static final Identifier yuh = new Identifier("endesite:yuh");
    public static SoundEvent YUH = new SoundEvent(yuh);
    public static final Identifier diskevent = new Identifier("endesite:enddisk");
    public static SoundEvent DISKEVENT = new SoundEvent(diskevent);
    private static ConfiguredFeature<?, ?> ENDESITE_ORE_END = Feature.ORE//handles oreshit
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                    ModBlocks.ENDESITE_ORE.getDefaultState(),
                    3))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    21)))
            .spreadHorizontally()
            .repeat(10);
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.RegisterBlocks();
        Registry.register(Registry.SOUND_EVENT, Endesite.yuh, YUH);
        RegistryKey<ConfiguredFeature<?, ?>> EndesiteOreEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,//initialize oreshit
                new Identifier("endesite", "endesite_ore_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndesiteOreEnd.getValue(), ENDESITE_ORE_END);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, EndesiteOreEnd);

    }
}
