package com.dkt;

import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ExpandedFrogLights2 implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("expanded_froglights2");

	public static final AbstractBlock.ContextPredicate predicate = (state, world, pos) -> true;

		public static final net.minecraft.block.PillarBlock AZURE_FROGLIGHT = new PillarBlock(FabricBlockSettings.create().strength(0.5f).luminance(15));
		public static final net.minecraft.block.PillarBlock CAUCASIAN_FROGLIGHT = new PillarBlock(FabricBlockSettings.create().strength(0.5f).luminance(15));
		public static final net.minecraft.block.PillarBlock CELADON_FROGLIGHT = new PillarBlock(FabricBlockSettings.create().strength(0.5f).luminance(15));
		public static final net.minecraft.block.PillarBlock CORALLINE_FROGLIGHT = new PillarBlock(FabricBlockSettings.create().strength(0.5f).luminance(15));
		public static final net.minecraft.block.PillarBlock EBON_FROGLIGHT = new PillarBlock(FabricBlockSettings.create().strength(0.5f).luminance(15));
		public static final net.minecraft.block.PillarBlock GRIDEPERLE_FROGLIGHT = new PillarBlock(FabricBlockSettings.create().strength(0.5f).luminance(15));
		public static final net.minecraft.block.PillarBlock NAVY_FROGLIGHT = new PillarBlock(FabricBlockSettings.create().strength(0.5f).luminance(15));
		public static final net.minecraft.block.PillarBlock RUDDY_FROGLIGHT = new PillarBlock(FabricBlockSettings.create().strength(0.5f).luminance(15));
		public static final net.minecraft.block.PillarBlock VIOLACEOUS_FROGLIGHT = new PillarBlock(FabricBlockSettings.create().strength(0.5f).luminance(15));




	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading Expanded Froglight Blocks");
		Registry.register(Registries.BLOCK, new Identifier("expanded_froglights2", "azure_froglight"), AZURE_FROGLIGHT);
		Registry.register(Registries.ITEM, new Identifier("expanded_froglights2", "azure_froglight"), new BlockItem(AZURE_FROGLIGHT, new FabricItemSettings()));

		Registry.register(Registries.BLOCK, new Identifier("expanded_froglights2", "caucasian_froglight"), CAUCASIAN_FROGLIGHT);
		Registry.register(Registries.ITEM, new Identifier("expanded_froglights2", "caucasian_froglight"), new BlockItem(CAUCASIAN_FROGLIGHT, new FabricItemSettings()));


		Registry.register(Registries.BLOCK, new Identifier("expanded_froglights2", "celadon_froglight"), CELADON_FROGLIGHT);
		Registry.register(Registries.ITEM, new Identifier("expanded_froglights2", "celadon_froglight"), new BlockItem(CELADON_FROGLIGHT, new FabricItemSettings()));


		Registry.register(Registries.BLOCK, new Identifier("expanded_froglights2", "coralline_froglight"), CORALLINE_FROGLIGHT);
		Registry.register(Registries.ITEM, new Identifier("expanded_froglights2", "coralline_froglight"), new BlockItem(CORALLINE_FROGLIGHT, new FabricItemSettings()));


		Registry.register(Registries.BLOCK, new Identifier("expanded_froglights2", "ebon_froglight"), EBON_FROGLIGHT);
		Registry.register(Registries.ITEM, new Identifier("expanded_froglights2", "ebon_froglight"), new BlockItem(EBON_FROGLIGHT, new FabricItemSettings()));


		Registry.register(Registries.BLOCK, new Identifier("expanded_froglights2", "grideperle_froglight"), GRIDEPERLE_FROGLIGHT);
		Registry.register(Registries.ITEM, new Identifier("expanded_froglights2", "grideperle_froglight"), new BlockItem(GRIDEPERLE_FROGLIGHT, new FabricItemSettings()));


		Registry.register(Registries.BLOCK, new Identifier("expanded_froglights2", "navy_froglight"), NAVY_FROGLIGHT);
		Registry.register(Registries.ITEM, new Identifier("expanded_froglights2", "navy_froglight"), new BlockItem(NAVY_FROGLIGHT, new FabricItemSettings()));


		Registry.register(Registries.BLOCK, new Identifier("expanded_froglights2", "ruddy_froglight"), RUDDY_FROGLIGHT);
		Registry.register(Registries.ITEM, new Identifier("expanded_froglights2", "ruddy_froglight"), new BlockItem(RUDDY_FROGLIGHT, new FabricItemSettings()));


		Registry.register(Registries.BLOCK, new Identifier("expanded_froglights2", "violaceous_froglight"), VIOLACEOUS_FROGLIGHT);
		Registry.register(Registries.ITEM, new Identifier("expanded_froglights2", "violaceous_froglight"), new BlockItem(VIOLACEOUS_FROGLIGHT, new FabricItemSettings()));




		LOGGER.info("Loading Expanded Froglight Blocks Done.");
	}
}