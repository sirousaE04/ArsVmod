package com.SiroE.ArsVmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.VillagerRegistry;

@Mod(modid = "ArsVmod", name = "ArsVmod", version = "1.0.0")
public class ArsVmod {
	public static final int ArsID=2434;

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		VillagerRegistry.instance().registerVillagerId(ArsID);

	}
}
