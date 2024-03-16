
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lyivx.lschiseld.init;

import net.lyivx.lsfurniture.init.LsFurnitureModBlocks;
import net.lyivx.lsfurniture.init.LsFurnitureModItems;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.lyivx.lschiseld.LsChiseldMod;

public class LsChiseldModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LsChiseldMod.MODID);
	public static final RegistryObject<CreativeModeTab> TAB = REGISTRY.register("tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ls_chiseld.tab")).icon(() -> new ItemStack(LsFurnitureModItems.CHISEL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LsChiseldModBlocks.OAK_LOG_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LOG_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LOG_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LOG_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LOG_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LOG_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LOG_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LOG_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.CRIMSON_STEM_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.WARPED_STEM_BUNDLE.get().asItem());
				tabData.accept(LsChiseldModBlocks.OAK_LOG_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LOG_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LOG_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LOG_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LOG_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LOG_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LOG_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LOG_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.OAK_LOG_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LOG_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LOG_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LOG_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LOG_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LOG_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LOG_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LOG_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.OAK_LOG_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LOG_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LOG_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LOG_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LOG_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LOG_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LOG_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LOG_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.OAK_LEAVES_POPPY.get().asItem());
				tabData.accept(LsChiseldModBlocks.OAK_LEAVES_DANDILION.get().asItem());
				tabData.accept(LsChiseldModBlocks.OAK_LEAVES_BLUE_ORCHID.get().asItem());
				tabData.accept(LsChiseldModBlocks.OAK_LEAVES_SEMI_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.OAK_LEAVES_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LEAVES_POPPY.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LEAVES_DANDILION.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LEAVES_BLUE_ORCHID.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LEAVES_SEMI_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LEAVES_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LEAVES_POPPY.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LEAVES_DANDILION.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LEAVES_BLUE_ORCHID.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LEAVES_SEMI_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LEAVES_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LEAVES_POPPY.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LEAVES_DANDILION.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LEAVES_BLUE_ORCHID.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LEAVES_SEMI_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LEAVES_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LEAVES_POPPY.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LEAVES_DANDILION.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LEAVES_BLUE_ORCHID.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LEAVES_SEMI_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LEAVES_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LEAVES_POPPY.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LEAVES_DANDILION.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LEAVES_BLUE_ORCHID.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LEAVES_SEMI_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LEAVES_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LEAVES_POPPY.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LEAVES_DANDILION.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LEAVES_BLUE_ORCHID.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LEAVES_SEMI_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LEAVES_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LEAVES_POPPY.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LEAVES_DANDILION.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LEAVES_BLUE_ORCHID.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LEAVES_SEMI_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LEAVES_FROSTED.get().asItem());
				tabData.accept(LsChiseldModBlocks.OAK_LOG_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.SPRUCE_LOG_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.BIRCH_LOG_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.JUNGLE_LOG_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.ACACIA_LOG_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.DARK_OAK_LOG_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.MANGROVE_LOG_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.CHERRY_LOG_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.BAMBOO_BLOCK_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.CRIMSON_STEM_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.WARPED_STEM_REINFORCED.get().asItem());
				tabData.accept(LsChiseldModBlocks.BAMBOO_BLOCK_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.CRIMSON_STEM_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.WARPED_STEM_PILLAR.get().asItem());
				tabData.accept(LsChiseldModBlocks.BAMBOO_BLOCK_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.CRIMSON_STEM_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.WARPED_STEM_PILLAR_CONNECTING.get().asItem());
				tabData.accept(LsChiseldModBlocks.BAMBOO_BLOCK_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.CRIMSON_STEM_NAILED.get().asItem());
				tabData.accept(LsChiseldModBlocks.WARPED_STEM_NAILED.get().asItem());
			})

					.build());
}
