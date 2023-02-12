package net.codeferret.solidblocks.item;

import net.codeferret.solidblocks.SolidBlocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, SolidBlocks.MOD_ID);

	public static void register(IEventBus eventBus)
	{
		ITEMS.register(eventBus);
	}
}
