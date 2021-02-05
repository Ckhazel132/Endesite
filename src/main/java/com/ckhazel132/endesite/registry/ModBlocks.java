package com.ckhazel132.endesite.registry;

import com.ckhazel132.endesite.Endesite;
import com.ckhazel132.endesite.blocks.endesite_block;
import com.ckhazel132.endesite.blocks.endesite_ore;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class ModBlocks {
//    public static final Block endesite_ore = new Block(FabricBlockSettings
//
//            .of(Material.METAL).strength(5f, 15f).breakByTool(FabricToolTags.PICKAXES, 3));
    public static final Block ENDESITE_ORE = new endesite_ore(FabricBlockSettings
            .of(Material.METAL).strength(5f, 15f).breakByTool(FabricToolTags.PICKAXES, 3));
    public static final Block ENDESITE_BLOCK = new endesite_block(FabricBlockSettings
            .of(Material.METAL).strength(5f, 15f).breakByTool(FabricToolTags.PICKAXES, 3));
    public static void RegisterBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Endesite.MOD_ID, "endesite_ore"), ENDESITE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Endesite.MOD_ID, "endesite_block"), ENDESITE_BLOCK);

    }
}
