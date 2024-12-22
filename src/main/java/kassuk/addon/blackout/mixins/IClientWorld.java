package kassuk.addon.blackout.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.network.PendingUpdateManager;
import net.minecraft.client.world.ClientWorld;

@Mixin(ClientWorld.class)
public interface IClientWorld {
    @Accessor("pendingUpdateManager")
    public PendingUpdateManager getPendingUpdateManager();
}
