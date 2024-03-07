package net.dimidium.aboe.item;

import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.level.material.Fluid;

public class MoltenBucket extends BucketItem implements IItemTab
{
    public MoltenBucket(Fluid fluid, Properties properties)
    {
        super(fluid, properties);
    }
}
