package US.Me.EmptyPlugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class main extends JavaPlugin implements Listener {
    private static Logger log;

    @Override
    public void onEnable() {
        log = getLogger();
        getServer().getPluginManager().registerEvents(this, this);
    }
}
