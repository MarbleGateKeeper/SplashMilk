package love.marblegate.splashmilk.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.HeartParticle;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ParticleFactoryRegistry {
    @SubscribeEvent
    public static void onParticleFactoryRegistration(RegisterParticleProvidersEvent event) {
        Minecraft.getInstance().particleEngine.register(ParticleTypeRegistry.MILK_AREA_EFFECT.get(), HeartParticle.AngryVillagerProvider::new);
    }
}
