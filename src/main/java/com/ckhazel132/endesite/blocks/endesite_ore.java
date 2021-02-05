package com.ckhazel132.endesite.blocks;

import com.ckhazel132.endesite.Endesite;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.sound.BlockSoundGroup;
import java.util.Random;

public class endesite_ore extends Block {
    public endesite_ore(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity placedBy, Hand hand, BlockHitResult blockHitResult) {
        if (!world.isClient) {
            world.playSound(null, blockPos, Endesite.YUH, SoundCategory.BLOCKS,1f, 1f);
        }
        return ActionResult.success(false);
    }

}