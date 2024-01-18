package org.theomenden.solaris.registry.fluids;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import org.jetbrains.annotations.NotNull;

public abstract class EutecticFluid extends FlowingFluid {
    @Override
    public boolean isSame(@NotNull Fluid fluid) {
        return fluid == getSource() || fluid == getFlowing();
    }

    @Override
    protected boolean canConvertToSource(Level level) {
        return false;
    }
}
