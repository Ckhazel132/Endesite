package com.ckhazel132.endesite.registry;
import com.ckhazel132.endesite.Endesite;
import com.ckhazel132.endesite.items.enddisk;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;


public class ModItems {
    //Items
    public static final Item Refined_Endesite = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item Etisedne_Denifer = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item End_Disk = new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(ItemGroup.MISC));
    //Item-form Blocks
    public static final BlockItem endesite_ore = new BlockItem(ModBlocks.ENDESITE_ORE, new Item.Settings().fireproof().group(ItemGroup.MATERIALS));
    public static final BlockItem endesite_block = new BlockItem(ModBlocks.ENDESITE_BLOCK, new Item.Settings().fireproof().group(ItemGroup.MATERIALS));
    public static void registerItems() {
        Item.Settings discsettings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(ItemGroup.MISC);
        Registry.register(Registry.ITEM,new Identifier(Endesite.MOD_ID, "refined_endesite"),Refined_Endesite);
        Registry.register(Registry.ITEM,new Identifier(Endesite.MOD_ID, "etisedne_denifer"),Etisedne_Denifer);
        Registry.register(Registry.ITEM,new Identifier(Endesite.MOD_ID, "endesite_ore"), endesite_ore);
        Registry.register(Registry.ITEM,new Identifier(Endesite.MOD_ID, "endesite_block"), endesite_block);
        Registry.register(Registry.ITEM,new Identifier(Endesite.MOD_ID, "enddisk"), new enddisk(14, Endesite.DISKEVENT, discsettings));
    }
}