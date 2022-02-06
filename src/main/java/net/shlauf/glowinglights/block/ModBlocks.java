package net.shlauf.glowinglights.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shlauf.glowinglights.GlowingLightsMain;
import org.lwjgl.system.CallbackI;

public class ModBlocks {

    public static final Block Glowing_BLUE = registerBlock("glowing_blue",
            new Block(FabricBlockSettings.of(Material.GLASS).luminance(15)), ItemGroup.DECORATIONS);


    public static final Block Glowing_LIGHT_GREEN = registerBlock("glowing_light_green",
            new Block(FabricBlockSettings.of(Material.GLASS).luminance(15)), ItemGroup.DECORATIONS);


    public static final Block Glowing_RED = registerBlock("glowing_red",
            new Block(FabricBlockSettings.of(Material.GLASS).luminance(15)), ItemGroup.DECORATIONS);

    public static final Block GLOWING_WHITE = registerBlock("glowing_white",
            new Block(FabricBlockSettings.of(Material.GLASS).luminance(15)), ItemGroup.DECORATIONS);

    public static final Block GLOWING_DARK_GREEN = registerBlock("glowing_dark_green",
            new Block(FabricBlockSettings.of(Material.GLASS).luminance(15)), ItemGroup.DECORATIONS);

    public static final Block GLOWING_CYAN = registerBlock("glowing_cyan",
            new Block(FabricBlockSettings.of(Material.GLASS).luminance(15)), ItemGroup.DECORATIONS);

    public static final Block GLOWING_YELLOW = registerBlock("glowing_yellow",
            new Block(FabricBlockSettings.of(Material.GLASS).luminance(15)), ItemGroup.DECORATIONS);

    public static final Block GLOWING_MAGNETA = registerBlock("glowing_magenta",
            new Block(FabricBlockSettings.of(Material.GLASS).luminance(15)), ItemGroup.DECORATIONS);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItems(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(GlowingLightsMain.MOD_ID, name), block);
    }

    private static Item registerBlockItems(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(GlowingLightsMain.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        GlowingLightsMain.LOGGER.info("Registering ModBlocks for " + GlowingLightsMain.MOD_ID);
    }
}
