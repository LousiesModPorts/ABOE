package net.dimidium.aboe.block.portal.thevoid;
import net.dimidium.dimidiumcore.api.block.BlockBase;
import net.dimidium.dimidiumcore.api.util.IBlockTab;
import net.minecraft.world.level.block.SoundType;

public class VoidPortalFrame extends BlockBase implements IBlockTab
{
    public VoidPortalFrame()
    {
        super(5F, 10F, SoundType.AMETHYST);
    }
}
