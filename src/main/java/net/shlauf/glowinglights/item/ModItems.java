package net.shlauf.glowinglights.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shlauf.glowinglights.GlowingLightsMain;

public class ModItems {

    public static final Item COLOR_CHANGER = registerItem("color_changer",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(GlowingLightsMain.MOD_ID, name), item);
    }

    public static void registerModItems(){


        GlowingLightsMain.LOGGER.info("Registering items for " + GlowingLightsMain.MOD_ID);
    }

}
