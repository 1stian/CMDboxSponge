import com.google.inject.Inject;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

import java.nio.file.Path;
import java.util.logging.Logger;

/**
 * Created by Stian on 03.06.2016.
 */
@Plugin(id = "cmdbox", name = "CMdBox", version = "0.1", description = "Essential commands for your server")
public class cmdBox {

    @Inject
    @ConfigDir(sharedRoot = false)
    private Path defaultConfig;

    @Inject
    public Logger logger;

    public void onServerStart(GameStartedServerEvent event)
    {

    }

}
