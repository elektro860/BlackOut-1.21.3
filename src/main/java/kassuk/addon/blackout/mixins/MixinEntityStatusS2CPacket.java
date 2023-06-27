package kassuk.addon.blackout.mixins;

import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(EntityStatusS2CPacket.class)
public interface MixinEntityStatusS2CPacket {
    @Accessor("id")
    int getId();
}