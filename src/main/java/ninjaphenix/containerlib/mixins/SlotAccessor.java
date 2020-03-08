package ninjaphenix.containerlib.mixins;

import net.minecraft.screen.slot.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Slot.class)
public interface SlotAccessor
{
	/**
	 * Sets the X position for the slot.
	 *
	 * @param x The new X position
	 */
	@Accessor("xPosition")
	void setX(int x);

	/**
	 * Sets the Y position for the slot.
	 *
	 * @param y The new Y position
	 */
	@Accessor("yPosition")
	void setY(int y);
}
