package ml.jozo.tobacco;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import org.bukkit.plugin.java.JavaPlugin;

public class Tobacco extends JavaPlugin implements SlimefunAddon {


    @Override
    public void onEnable() {
        getLogger().info("####################");
        getLogger().info("# Psychadelicsf v1 #");
        getLogger().info("#    by Jozo_85    #");
        getLogger().info("####################");

        Config cfg = new Config(this);
    }

    @Override
    public void onDisable() {
        // Login for disabling the plugin
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }
}
