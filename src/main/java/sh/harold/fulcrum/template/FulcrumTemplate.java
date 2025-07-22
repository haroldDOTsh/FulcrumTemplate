package sh.harold.fulcrum.template;

import org.bukkit.plugin.java.JavaPlugin;
import sh.harold.fulcrum.api.module.FulcrumModule;
import sh.harold.fulcrum.api.module.FulcrumPlatform;
import sh.harold.fulcrum.api.module.ModuleInfo;

@ModuleInfo(
        name = "MyFulcrumModule",
        description = "A sample Fulcrum module"
)
public final class FulcrumTemplate extends JavaPlugin implements FulcrumModule {


    @Override
    public void onEnable(FulcrumPlatform platform) {
        // Plugin startup logic
        getLogger().info("MyFulcrumModule has been enabled!");

        // Register commands, listeners, etc. here
        // Example: platform.getCommandManager().registerCommand(new MyCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
