package net.codeferret.solidblocks;

import com.mojang.logging.LogUtils;
import net.codeferret.solidblocks.block.ModBlocks;
import net.codeferret.solidblocks.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SolidBlocks.MOD_ID)
public class SolidBlocks
{
    public static final String MOD_ID = "solidblocks";
    private static final Logger LOGGER = LogUtils.getLogger();


    public SolidBlocks()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == CreativeModeTabs.COLORED_BLOCKS)
        {
            event.accept(ModBlocks.WHITE_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_BLOCK);
            event.accept(ModBlocks.GRAY_BLOCK);
            event.accept(ModBlocks.BLACK_BLOCK);
            event.accept(ModBlocks.BROWN_BLOCK);
            event.accept(ModBlocks.RED_BLOCK);
            event.accept(ModBlocks.ORANGE_BLOCK);
            event.accept(ModBlocks.YELLOW_BLOCK);
            event.accept(ModBlocks.LIME_BLOCK);
            event.accept(ModBlocks.GREEN_BLOCK);
            event.accept(ModBlocks.CYAN_BLOCK);
            event.accept(ModBlocks.LIGHT_BLUE_BLOCK);
            event.accept(ModBlocks.BLUE_BLOCK);
            event.accept(ModBlocks.PURPLE_BLOCK);
            event.accept(ModBlocks.MAGENTA_BLOCK);
            event.accept(ModBlocks.PINK_BLOCK);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
