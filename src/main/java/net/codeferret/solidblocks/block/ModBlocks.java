package net.codeferret.solidblocks.block;

import net.codeferret.solidblocks.SolidBlocks;
import net.codeferret.solidblocks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, SolidBlocks.MOD_ID);

	public static final RegistryObject<Block> WHITE_BLOCK      = registerBlock("white_block",      () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ORANGE_BLOCK     = registerBlock("orange_block",     () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MAGENTA_BLOCK    = registerBlock("magenta_block",    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIGHT_BLUE_BLOCK = registerBlock("light_blue_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> YELLOW_BLOCK     = registerBlock("yellow_block",     () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIME_BLOCK       = registerBlock("lime_block",       () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PINK_BLOCK       = registerBlock("pink_block",       () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRAY_BLOCK       = registerBlock("gray_block",       () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> LIGHT_GRAY_BLOCK = registerBlock("light_gray_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CYAN_BLOCK       = registerBlock("cyan_block",       () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PURPLE_BLOCK     = registerBlock("purple_block",     () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLUE_BLOCK       = registerBlock("blue_block",       () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BROWN_BLOCK      = registerBlock("brown_block",      () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GREEN_BLOCK      = registerBlock("green_block",      () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_BLOCK        = registerBlock("red_block",        () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACK_BLOCK      = registerBlock("black_block",      () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()));


	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
	{
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
	{
		return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
				new Item.Properties()));
	}

	public static void register(IEventBus eventBus)
	{
		BLOCKS.register(eventBus);
	}
}
