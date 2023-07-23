package net.skpc9;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NormalDamage.MODID)
public class NormalDamage
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "normaldamage";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public NormalDamage()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
