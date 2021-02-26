package net.velinquish.comet.commands;

import java.io.IOException;

import org.bukkit.command.CommandSender;
import org.bukkit.configuration.InvalidConfigurationException;

import net.velinquish.comet.Comet;
import net.velinquish.utils.AnyCommand;
import net.velinquish.utils.lang.StringNode;

public class ReloadCommand extends AnyCommand {

	private Comet plugin = Comet.getInstance();

	@Override
	protected void run(CommandSender sender, String[] args, boolean silent) {
		checkPermission(plugin.getPermission());
		try {
			plugin.loadFiles();
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
			returnTell(new StringNode("An error has occurred when reloading &3&nconfig.yml&7 and &3&nlang.yml&7!"));
		}
		tell(plugin.getLangManager().getNode("plugin-reloaded"));
	}

}
