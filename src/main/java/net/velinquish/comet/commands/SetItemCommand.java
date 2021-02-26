package net.velinquish.comet.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.minecraft.server.v1_12_R1.Material;
import net.velinquish.comet.Comet;
import net.velinquish.utils.PlayerCommand;

public class SetItemCommand extends PlayerCommand {

	private Comet plugin = Comet.getInstance();

	@Override
	protected void run(CommandSender sender, String[] args, boolean silent) {
		checkPermission(plugin.getPermission());

		Player player = (Player) sender;

		ItemStack item = player.getInventory().getItemInMainHand();

		if (item.getType().equals(Material.AIR))
			returnTell(plugin.getLangManager().getNode("invalid-material"));

		plugin.setMetReward(item);
		plugin.saveItems(item, "meteor-reward");
		tell(plugin.getLangManager().getNode("meteor-reward-set"));
	}

}
