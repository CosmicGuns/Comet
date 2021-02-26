package net.velinquish.comet;

import org.bukkit.Location;

import lombok.Getter;

public class Path {
	@Getter
	private Location spawn;
	@Getter
	private Location destination;

	public Path(Location s, Location d) {
		spawn = s;
		destination = d;
	}
}
