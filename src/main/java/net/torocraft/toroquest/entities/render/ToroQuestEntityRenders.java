package net.torocraft.toroquest.entities.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.torocraft.toroquest.entities.EntityBas;
import net.torocraft.toroquest.entities.EntityFugitive;
import net.torocraft.toroquest.entities.EntityGuard;
import net.torocraft.toroquest.entities.EntityMage;
import net.torocraft.toroquest.entities.EntityMonolithEye;
import net.torocraft.toroquest.entities.EntityRainbowGuard;
import net.torocraft.toroquest.entities.EntityRainbowKing;
import net.torocraft.toroquest.entities.EntitySentry;
import net.torocraft.toroquest.entities.EntityShopkeeper;
import net.torocraft.toroquest.entities.EntityToro;
import net.torocraft.toroquest.entities.EntityVampireBat;
import net.torocraft.toroquest.entities.EntityVillageLord;

public class ToroQuestEntityRenders {

	public static void init() {
		registerMageRenderer();
		registerMonolithEyeRenderer();
		EntityToro.registerRenders();
		EntityGuard.registerRenders();
		EntityShopkeeper.registerRenders();
		EntityBas.registerRenders();
		EntityVampireBat.registerRenders();
		EntitySentry.registerRenders();
		EntityRainbowGuard.registerRenders();
		EntityRainbowKing.registerRenders();
		EntityVillageLord.registerRenders();
		EntityFugitive.registerRenders();
	}
	
	public static void registerMageRenderer() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMage.class, new IRenderFactory<EntityMage>() {
			@Override 
			public Render<EntityMage> createRenderFor(RenderManager manager) { 
				return new RenderMage(manager); 
			}
		});
	}
	
	public static void registerMonolithEyeRenderer() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMonolithEye.class, new IRenderFactory<EntityMonolithEye>() {
			@Override 
			public Render<EntityMonolithEye> createRenderFor(RenderManager manager) { 
				return new RenderMonolithEye(manager); 
			}
		});
	}
	
}
